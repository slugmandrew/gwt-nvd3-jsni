package com.slugmandrew.nvd3.nv;

import com.slugmandrew.nvd3.nv.model.Chart;
import com.slugmandrew.nvd3.util.JSObject;

public class NV extends JSObject
{
    protected NV()
    {
    }

    public static native JSObject self() /*-{
        return $wnd.nv;
    }-*/;

    public static JSObject createChart(String cssId, Chart chart, JSObject graphData)
    {
        return NVImpl.createChart(cssId, chart.getJSObject(), graphData);
    }

    /**
     * Call this method with a result of createChart
     *
     * @param func
     */
    public static native void addGraph(JSObject func) /*-{
        $wnd.nv.addGraph(func);
    }-*/;

    public static NVModel getModels()
    {
        return new NVModel(NVImpl.getModels(self()));
    }

    public static NVUtil getUtils()
    {
        return new NVUtil(NVImpl.getUtils(self()));
    }

}
