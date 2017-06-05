package com.slugmandrew.nvd3.nv;

import com.slugmandrew.nvd3.util.JSObject;

public class NVImpl {

	public static native JSObject createChart(String cssId, JSObject chart, JSObject graphData) /*-{
		
		var callback = function() {
			var data = $wnd.d3.select(cssId).datum(graphData).call(chart);
			$wnd.nv.utils.windowResize(chart.update);
		}

		return callback;
	}-*/;

	public static native JSObject getModels(JSObject self)/*-{
		return self.models;
	}-*/;

	public static native JSObject getUtils(JSObject self)/*-{
		return self.utils;
	}-*/;

}
