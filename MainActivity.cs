using Android.App;
using Android.OS;
using Android.Support.V7.App;
using Android.Runtime;
using Android.Widget;
using Android.Views;
using Android.Graphics;
using Android.Media;
using System.IO;
using Java.Lang;

namespace XamarinVideoSample
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme", MainLauncher = true)]
    public class MainActivity : AppCompatActivity, ISurfaceHolderCallback, MediaPlayer.IOnPreparedListener, MediaController.IMediaPlayerControl, View.IOnTouchListener, IRunnable
    {
        private VideoView myVideoView;
        private MediaPlayer myPlayer;
        private MediaController mediaController;
        private Handler handler = new Handler();        

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.activity_main);

            myVideoView = (VideoView)FindViewById(Resource.Id.my_video_view);                                               
            ISurfaceHolder holder = myVideoView.Holder;
            holder.AddCallback(this);

            myVideoView.SetOnTouchListener(this);        
        }
        
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }        

        public void SurfaceChanged(ISurfaceHolder holder, [GeneratedEnum] Format format, int width, int height)
        {
            Toast.MakeText(this, "surface changed", ToastLength.Short).Show();
            if (myPlayer.IsPlaying) myPlayer.Pause();
        }

        public void SurfaceCreated(ISurfaceHolder holder)
        {
            myPlayer = new MediaPlayer();
            myPlayer.SetDisplay(holder);
            
            Android.Content.Res.AssetFileDescriptor afd = this.Resources.OpenRawResourceFd(Resource.Raw.whatisit);

            if (afd != null)
            {
                myPlayer.SetOnPreparedListener(this);

                try
                {
                    myPlayer.SetDataSource(afd.FileDescriptor, afd.StartOffset, afd.Length);
                    myPlayer.Prepare();
                    mediaController = new MediaController(this);
                }
                catch (IOException e)
                {
                    Toast.MakeText(this, "something wrong!\n" + e.ToString(), ToastLength.Short).Show();
                }
            }            
        }

        public void SurfaceDestroyed(ISurfaceHolder holder)
        {
            Toast.MakeText(this, "surface destroyed", ToastLength.Short).Show();
            if(myPlayer.IsPlaying)
            {
                myPlayer.Stop();                
            }
        }

        public void OnPrepared(MediaPlayer mp)
        {
            myPlayer.Start();
            mediaController.SetMediaPlayer(this);
            mediaController.SetAnchorView(myVideoView);

            handler.Post(this);
        }

        public int AudioSessionId => myPlayer.AudioSessionId;
        public int BufferPercentage => 0;
        public int CurrentPosition => myPlayer.CurrentPosition;
        public int Duration => myPlayer.Duration;
        public bool IsPlaying => myPlayer.IsPlaying;

        public bool CanPause()
        {
            return true;
        }

        public bool CanSeekBackward()
        {
            return true;
        }

        public bool CanSeekForward()
        {
            return true;
        }

        public void Pause()
        {
            myPlayer.Pause();
        }

        public void SeekTo(int pos)
        {
            myPlayer.SeekTo(pos);
        }

        public void Start()
        {
            myPlayer.Start();
        }

        public bool OnTouch(View v, MotionEvent e)
        {
            if (mediaController != null)
            {
                mediaController.Show();
            }
            return false;        
        }

        public void Run()
        {
            mediaController.Enabled = true;
            mediaController.Show();
        }
    }
}