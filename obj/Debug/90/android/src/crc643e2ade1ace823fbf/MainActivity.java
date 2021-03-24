package crc643e2ade1ace823fbf;


public class MainActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		android.view.SurfaceHolder.Callback,
		android.media.MediaPlayer.OnPreparedListener,
		android.widget.MediaController.MediaPlayerControl,
		android.view.View.OnTouchListener,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onRequestPermissionsResult:(I[Ljava/lang/String;[I)V:GetOnRequestPermissionsResult_IarrayLjava_lang_String_arrayIHandler\n" +
			"n_surfaceChanged:(Landroid/view/SurfaceHolder;III)V:GetSurfaceChanged_Landroid_view_SurfaceHolder_IIIHandler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_surfaceCreated:(Landroid/view/SurfaceHolder;)V:GetSurfaceCreated_Landroid_view_SurfaceHolder_Handler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_surfaceDestroyed:(Landroid/view/SurfaceHolder;)V:GetSurfaceDestroyed_Landroid_view_SurfaceHolder_Handler:Android.Views.ISurfaceHolderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onPrepared:(Landroid/media/MediaPlayer;)V:GetOnPrepared_Landroid_media_MediaPlayer_Handler:Android.Media.MediaPlayer/IOnPreparedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getAudioSessionId:()I:GetGetAudioSessionIdHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getBufferPercentage:()I:GetGetBufferPercentageHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getCurrentPosition:()I:GetGetCurrentPositionHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getDuration:()I:GetGetDurationHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_isPlaying:()Z:GetIsPlayingHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_canPause:()Z:GetCanPauseHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_canSeekBackward:()Z:GetCanSeekBackwardHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_canSeekForward:()Z:GetCanSeekForwardHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_pause:()V:GetPauseHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_seekTo:(I)V:GetSeekTo_IHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_start:()V:GetStartHandler:Android.Widget.MediaController/IMediaPlayerControlInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("XamarinVideoSample.MainActivity, XamarinVideoSample", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("XamarinVideoSample.MainActivity, XamarinVideoSample", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2)
	{
		n_onRequestPermissionsResult (p0, p1, p2);
	}

	private native void n_onRequestPermissionsResult (int p0, java.lang.String[] p1, int[] p2);


	public void surfaceChanged (android.view.SurfaceHolder p0, int p1, int p2, int p3)
	{
		n_surfaceChanged (p0, p1, p2, p3);
	}

	private native void n_surfaceChanged (android.view.SurfaceHolder p0, int p1, int p2, int p3);


	public void surfaceCreated (android.view.SurfaceHolder p0)
	{
		n_surfaceCreated (p0);
	}

	private native void n_surfaceCreated (android.view.SurfaceHolder p0);


	public void surfaceDestroyed (android.view.SurfaceHolder p0)
	{
		n_surfaceDestroyed (p0);
	}

	private native void n_surfaceDestroyed (android.view.SurfaceHolder p0);


	public void onPrepared (android.media.MediaPlayer p0)
	{
		n_onPrepared (p0);
	}

	private native void n_onPrepared (android.media.MediaPlayer p0);


	public int getAudioSessionId ()
	{
		return n_getAudioSessionId ();
	}

	private native int n_getAudioSessionId ();


	public int getBufferPercentage ()
	{
		return n_getBufferPercentage ();
	}

	private native int n_getBufferPercentage ();


	public int getCurrentPosition ()
	{
		return n_getCurrentPosition ();
	}

	private native int n_getCurrentPosition ();


	public int getDuration ()
	{
		return n_getDuration ();
	}

	private native int n_getDuration ();


	public boolean isPlaying ()
	{
		return n_isPlaying ();
	}

	private native boolean n_isPlaying ();


	public boolean canPause ()
	{
		return n_canPause ();
	}

	private native boolean n_canPause ();


	public boolean canSeekBackward ()
	{
		return n_canSeekBackward ();
	}

	private native boolean n_canSeekBackward ();


	public boolean canSeekForward ()
	{
		return n_canSeekForward ();
	}

	private native boolean n_canSeekForward ();


	public void pause ()
	{
		n_pause ();
	}

	private native void n_pause ();


	public void seekTo (int p0)
	{
		n_seekTo (p0);
	}

	private native void n_seekTo (int p0);


	public void start ()
	{
		n_start ();
	}

	private native void n_start ();


	public boolean onTouch (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (android.view.View p0, android.view.MotionEvent p1);


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}