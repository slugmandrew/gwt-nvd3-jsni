package com.slugmandrew.nvd3.nv.model;


import com.slugmandrew.nvd3.util.JSObject;

public class AxisImpl {

	public static native void setTickFormat(JSObject self, String value)/*-{
		self.tickFormat($wnd.d3.format(value));
	}-*/;

	public static native void setTickFormatAsDate(JSObject self)/*-{
		self.tickFormat(function(d) { return $wnd.d3.time.format('%x')(new Date(d)) });
	}-*/;
	
	public static native void setAxisLabel(JSObject self, String value)/*-{
		self.axisLabel(value);
	}-*/;
	
}
