package com.slugmandrew.nvd3.nv;


import com.slugmandrew.nvd3.util.JSObject;

public class NVUtilImpl {

	public static native void setWindowResize(JSObject self, JSObject chart)/*-{
		self.windowResize(chart.update);
	}-*/;
	
}
