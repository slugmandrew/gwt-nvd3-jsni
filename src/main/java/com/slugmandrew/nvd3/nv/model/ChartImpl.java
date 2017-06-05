package com.slugmandrew.nvd3.nv.model;

import com.slugmandrew.nvd3.util.JSObject;

public class ChartImpl
{
    public static native void setStaggerLabels(JSObject self, boolean value)/*-{
        self.staggerLabels(value);
    }-*/;

    public static native void setTooltips(JSObject self, boolean value)/*-{
        self.tooltips(value);
    }-*/;

    public static native void setShowValues(JSObject self, boolean value)/*-{
        self.showValues(value);
    }-*/;

    public static native void setValueFormat(JSObject self, String value)/*-{
        self.valueFormat($wnd.d3.format(value));
    }-*/;

    public static native void setShowLegend(JSObject self, boolean value)/*-{
        self.showLegend(value);
    }-*/;

    public static native void setShowControls(JSObject self, boolean value)/*-{
        self.showControls(value);
    }-*/;

    public static native void setShowXAxis(JSObject self, boolean value)/*-{
        self.showXAxis(value);
    }-*/;

    public static native void setShowYAxis(JSObject self, boolean value)/*-{
        self.showYAxis(value);
    }-*/;

    public static native void setUseInteractiveGuideline(JSObject self, boolean value)/*-{
        self.useInteractiveGuideline(value);
    }-*/;

    public static native void setTransitionDuration(JSObject self, int value)/*-{
        self.transitionDuration(value);
    }-*/;

    public static native void setX(JSObject self, String code)/*-{
        var translated = $wnd.eval(code);
        self.x(translated);
    }-*/;

    public static native void setY(JSObject self, String code)/*-{
        var translated = $wnd.eval(code);
        self.y(translated);
    }-*/;

    public static native void setMargin(JSObject self, int top, int right, int bottom, int left)/*-{
        self.margin({
            'top': top,
            'right': right,
            'bottom': bottom,
            'left': left
        });
    }-*/;

    public static native void setStacked(JSObject self, boolean value)/*-{
        self.stacked(value);
    }-*/;

    public static native JSObject getXAxis(JSObject self)/*-{
        return self.xAxis;
    }-*/;

    public static native JSObject getYAxis(JSObject self)/*-{
        return self.yAxis;
    }-*/;

    public static native JSObject getY2Axis(JSObject self)/*-{
        return self.y2Axis;
    }-*/;

    public static native void setRightAlignYAxis(JSObject self, boolean value)/*-{
        self.rightAlignYAxis(value);
    }-*/;

    public static native void setClipEdge(JSObject self, boolean value)/*-{
        self.clipEdge(value);
    }-*/;

    public static native void setReduceXTicks(JSObject self, boolean value)/*-{
        self.reduceXTicks(value);
    }-*/;

    public static native void setRotateLabels(JSObject self, double value)/*-{
        self.rotateLabels(value);
    }-*/;

    public static native void setGroupSpacing(JSObject self, double value)/*-{
        self.groupSpacing(value);
    }-*/;

    public static native void setShowLabels(JSObject self, boolean value)/*-{
        self.showLabels(value);
    }-*/;

    public static native void setLabelThreshold(JSObject self, double value)/*-{
        self.labelThreshold(value);
    }-*/;

    public static native void setLabelType(JSObject self, String value)/*-{
        self.labelType(value);
    }-*/;

    public static native void setDonut(JSObject self, boolean value)/*-{
        self.donut(value);
    }-*/;

    public static native void setDonutRatio(JSObject self, double value)/*-{
        self.donutRatio(value);
    }-*/;

}
