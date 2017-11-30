package com.pxh.reflex;

import com.pxh.exception.CustomException;

/**
  * FileName: ReflexFactory.java
  * package com.pxh.reflex
  *Type ReflexFactory
  * git 
  * Author:   Peng Xuehui
  * Date:     2017年11月30日 下午4:01:07
  * Description: Loading class factory
  * History:
  * <author>          <time>          <version>          <desc>
  * 作者姓名           修改时间           版本号              描述
  */
public class ReflexFactory {
	
	/**
	 * 调用此方法必须创建一个对象，根据对象来加载对象的类信息
	  * @Time:2017年11月30日 下午3:21:37
	  * @Author:Peng Xh
	  * @Description: Object method loading 
	  * @git 
	  * @param t
	  * @return
	  * @Return Class
	  * History:
	  * <author>          <time>          <version>          <desc>
	  * 作者姓名           修改时间           版本号              描述
	 */
	@SuppressWarnings("rawtypes")
	public static <T> Class loadClassByObject(T t)throws Exception{
		Class clz = null;
		//判断是否为空
		if(null != t){
			clz = t.getClass();
		}else{
			throw new CustomException(-1, "参数为空");
		}
		return  clz;
	}
	
	/**
	 * 
	  * @Time:2017年11月30日 下午3:53:45
	  * @Author:Peng Xh
	  * @Description: Loading according to the packet path
	  * @git 
	  * @param bagRotu
	  * @return
	  * @throws Exception
	  * @Return Class
	  * History:
	  * <author>          <time>          <version>          <desc>
	  * 作者姓名           修改时间           版本号              描述
	 */
	@SuppressWarnings("rawtypes")
	public static Class loadClassByRotu(String bagRotu)throws Exception{
		Class clz = null;
		if(null != bagRotu && !"".equals(bagRotu)){
			clz = Class.forName(bagRotu);
		}else{
			throw new CustomException(-1, "参数为空");
		}
		return clz;
	}
	
}
