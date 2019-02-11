package cn.e3mall.freemaker;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**  

* <p>Title: FreemakerTest</p>  

* <p>Description: </p>  

* @author 赵天宇

* @date 2019年1月11日  

*/
public class FreemakerTest {

		@Test
		public void showtest() throws Exception{
			//1.创建一个模版文件
			//2.创建一个configuration对象
			Configuration configuration = new Configuration(Configuration.getVersion());
			//3.设置模版文件保存的目录
			configuration.setDirectoryForTemplateLoading(new File("D:/workspace/e3-item-web/src/main/webapp/WEB-INF/ftl"));
			//4.模版文件的编码格式。一般是UTF-8
			configuration.setDefaultEncoding("utf-8");
			//5.加载一个模版文件，创建一个模版对象
			Template template = configuration.getTemplate("hello.ftl");
			//6.创建一个数据集，可以是pojo也可以是map,推荐使用map
			Map map = new HashMap<>();
			map.put("hello","hello freemaker !!!" );
			//7.创建一个writer对象，指定输出文件的路径以及文件名
			FileWriter out = new FileWriter(new File("G:/wodetianafreemaker/hello.txt"));
			//8.生成静态页面
			template.process(map, out);
			//9.关闭流
			out.close();
			
		}
}
