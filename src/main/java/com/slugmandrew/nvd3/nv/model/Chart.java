package com.slugmandrew.nvd3.nv.model;

import com.slugmandrew.nvd3.util.JSObject;
import com.slugmandrew.nvd3.util.JSObjectWrapper;

public class Chart extends JSObjectWrapper
{
	public Chart(JSObject object)
	{
		super(object);
	}
	
	public Axis getXAxis()
	{
		return new Axis(ChartImpl.getXAxis(getJSObject()));
	}
	
	public Axis getYAxis()
	{
		return new Axis(ChartImpl.getYAxis(getJSObject()));
	}
	
	public Axis getY2Axis()
	{
		return new Axis(ChartImpl.getY2Axis(getJSObject()));
	}
	
	public Chart setStacked(boolean value)
	{
		ChartImpl.setStacked(getJSObject(), value);
		return this;
	}
	
	public Chart setMargin(int top, int right, int bottom, int left)
	{
		ChartImpl.setMargin(getJSObject(), top, right, bottom, left);
		return this;
	}
	
	public Chart setStaggerLabels(boolean value)
	{
		ChartImpl.setStaggerLabels(getJSObject(), value);
		return this;
	}
	
	public Chart setTooltips(boolean value)
	{
		ChartImpl.setTooltips(getJSObject(), value);
		return this;
	}
	
	public Chart setShowLabels(boolean value)
	{
		ChartImpl.setShowLabels(getJSObject(), value);
		return this;
	}
	
	public Chart setLabelThreshold(double value)
	{
		ChartImpl.setLabelThreshold(getJSObject(), value);
		return this;
	}
	
	public Chart setLabelType(String value)
	{
		ChartImpl.setLabelType(getJSObject(), value);
		return this;
	}
	
	public Chart setDonut(boolean value)
	{
		ChartImpl.setDonut(getJSObject(), value);
		return this;
	}
	
	public Chart setDonutRatio(double value)
	{
		ChartImpl.setDonutRatio(getJSObject(), value);
		return this;
	}
	
	public Chart setShowXAxis(boolean value)
	{
		ChartImpl.setShowXAxis(getJSObject(), value);
		return this;
	}
	
	public Chart setShowYAxis(boolean value)
	{
		ChartImpl.setShowYAxis(getJSObject(), value);
		return this;
	}
	
	public Chart setShowValues(boolean value)
	{
		ChartImpl.setShowValues(getJSObject(), value);
		return this;
	}
	
	public Chart setValueFormat(String value)
	{
		ChartImpl.setValueFormat(getJSObject(), value);
		return this;
	}
	
	public Chart setShowControls(boolean value)
	{
		ChartImpl.setShowControls(getJSObject(), value);
		return this;
	}
	
	public Chart setShowLegend(boolean value)
	{
		ChartImpl.setShowLegend(getJSObject(), value);
		return this;
	}
	
	public Chart setTransitionDuration(int value)
	{
		ChartImpl.setTransitionDuration(getJSObject(), value);
		return this;
	}
	
	public Chart setUseInteractiveGuideline(boolean value)
	{
		ChartImpl.setUseInteractiveGuideline(getJSObject(), value);
		return this;
	}
	
	public Chart setRightAlignYAxis(boolean value)
	{
		ChartImpl.setRightAlignYAxis(getJSObject(), value);
		return this;
	}
	
	public Chart setClipEdge(boolean value)
	{
		ChartImpl.setClipEdge(getJSObject(), value);
		return this;
	}
	
	public Chart setReduceXTicks(boolean value)
	{
		ChartImpl.setReduceXTicks(getJSObject(), value);
		return this;
	}
	
	public Chart setRotateLabels(double value)
	{
		ChartImpl.setRotateLabels(getJSObject(), value);
		return this;
	}
	
	public Chart setGroupSpacing(double value)
	{
		ChartImpl.setGroupSpacing(getJSObject(), value);
		return this;
	}
	
	/**
	 * Example: function(d) { return d.label }
	 * 
	 * Do not forget to add () !
	 * 
	 * @param code
	 */
	public Chart setX(String code)
	{
		ChartImpl.setX(getJSObject(), "(" + code + ")");
		return this;
	}
	
	/**
	 * Example: function(d) { return d.label }
	 * 
	 * Do not forget to add () !
	 * 
	 * @param code
	 */
	public Chart setY(String code)
	{
		ChartImpl.setY(getJSObject(), "(" + code + ")");
		return this;
	}
	
}
