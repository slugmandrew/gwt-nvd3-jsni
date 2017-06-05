package com.slugmandrew.nvd3.nv;

import com.slugmandrew.nvd3.util.JSObject;
import com.slugmandrew.nvd3.nv.model.Chart;
import com.slugmandrew.nvd3.util.JSObjectWrapper;

public class NVUtil extends JSObjectWrapper
{

	public NVUtil(JSObject object) {
		super(object);
	}

	public void setWindowResize(Chart chart){
		NVUtilImpl.setWindowResize(getJSObject(), chart.getJSObject());
	}

}
