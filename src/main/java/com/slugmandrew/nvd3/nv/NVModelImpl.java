package com.slugmandrew.nvd3.nv;

import com.slugmandrew.nvd3.util.JSObject;

public class NVModelImpl {

	public static native JSObject getDiscreteBarChart(JSObject self)/*-{
		return self.discreteBarChart();
	}-*/;

	public static native JSObject getMultiBarHorizontalChart(JSObject self)/*-{
		return self.multiBarHorizontalChart();
	}-*/;

	public static native JSObject getMultiBarChart(JSObject self)/*-{
		return self.multiBarChart();
	}-*/;

	public static native JSObject getLineChart(JSObject self)/*-{
		return self.lineChart();
	}-*/;

	public static native JSObject getStackedAreaChart(JSObject self)/*-{
		return self.stackedAreaChart();
	}-*/;

	public static native JSObject getPieChart(JSObject self)/*-{
		return self.pieChart();
	}-*/;

	public static native JSObject getLineWithFocusChart(JSObject self)/*-{
		return self.lineWithFocusChart();
	}-*/;
	
}
