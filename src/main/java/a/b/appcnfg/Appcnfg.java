package a.b.appcnfg;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Appcnfg extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { Hibernatecnfg.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppInitialize.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
