package japidviews.Application.profile;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import static japidviews._javatags.Pic.*;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/profile/License.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class License extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/profile/License.html";
	{
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public License() {
		super(null);
	}
	public License(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"value",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"byte",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.profile.License.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private byte value; // line 2, japidviews/Application/profile/License.html
	public cn.bran.japid.template.RenderResult render(byte value) {
		this.value = value;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 2, japidviews/Application/profile/License.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(byte value) {
		return new License().render(value);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
;// line 1, japidviews\Application\profile\License.html
// line 5, japidviews\Application\profile\License.html
		p("<div class=\"grid_row license\">\n" + 
"\n" + 
"    <div class=\"col col_3 \">\n" + 
"        <div class=\"sidebar-nav \">\n" + 
"            ");// line 8, japidviews\Application\profile\License.html
		final SettingsMenu _SettingsMenu3 = new SettingsMenu(getOut()); _SettingsMenu3.setActionRunners(getActionRunners()).setOut(getOut()); _SettingsMenu3.render("License"); // line 14, japidviews\Application\profile\License.html// line 14, japidviews\Application\profile\License.html
		p("        </div>\n" + 
"    </div>\n" + 
"    <div class=\"col col_13 \">\n" + 
"        <div class=\"row-fluid \">\n" + 
"            <div class=\"col-lg-12 well\">\n" + 
"                <input type=\"hidden\" value=\"");// line 14, japidviews\Application\profile\License.html
		p(value);// line 20, japidviews\Application\profile\License.html
		p("\" id=\"licenseLastValue\"/>\n" + 
"\n" + 
"                <form class=\"form-horizontal\" action=\"/settings/license/done\" id=\"licenseForm\"\n" + 
"                      method=\"post\">\n" + 
"                    ");// line 20, japidviews\Application\profile\License.html
		final AllMessage _AllMessage4 = new AllMessage(getOut()); _AllMessage4.setActionRunners(getActionRunners()).setOut(getOut()); _AllMessage4.render(); // line 24, japidviews\Application\profile\License.html// line 24, japidviews\Application\profile\License.html
		p("\n" + 
"\n" + 
"                    <div class=\"subtitle\">");// line 24, japidviews\Application\profile\License.html
		;p(getMessage("license.content"));// line 27, japidviews\Application\profile\License.html
		p("</div>\n" + 
"                    <div class=\"form-group  \">\n" + 
"                        <h4>");// line 27, japidviews\Application\profile\License.html
		;p(getMessage("license.by"));// line 29, japidviews\Application\profile\License.html
		p("</h4>\n" + 
"                        <label class=\"radio\">\n" + 
"                            <input type=\"radio\" name=\"by\" value=\"0\" checked>\n" + 
"                            ");// line 29, japidviews\Application\profile\License.html
		;p(getMessage("yes"));// line 32, japidviews\Application\profile\License.html
		p("                        </label>\n" + 
"                        <label class=\"radio\">\n" + 
"                            <input type=\"radio\" name=\"by\" id=\"nd\" value=\"nd\">\n" + 
"                            ");// line 32, japidviews\Application\profile\License.html
		;p(getMessage("no"));// line 36, japidviews\Application\profile\License.html
		p("                        </label>\n" + 
"                        <label class=\"radio\">\n" + 
"                            <input type=\"radio\" name=\"by\" id=\"sa\" value=\"sa\">\n" + 
"                            ");// line 36, japidviews\Application\profile\License.html
		;p(getMessage("license.by.share"));// line 40, japidviews\Application\profile\License.html
		p("                        </label>\n" + 
"\n" + 
"                    </div>\n" + 
"                    <div class=\"form-group  \">\n" + 
"                        <h4>");// line 40, japidviews\Application\profile\License.html
		;p(getMessage("license.commercial"));// line 45, japidviews\Application\profile\License.html
		p("</h4>\n" + 
"\n" + 
"\n" + 
"                        <label class=\"radio\">\n" + 
"                            <input type=\"radio\" name=\"c\" value=\"1\" checked>\n" + 
"                            ");// line 45, japidviews\Application\profile\License.html
		;p(getMessage("yes"));// line 50, japidviews\Application\profile\License.html
		p("                        </label>\n" + 
"                        <label class=\"radio\">\n" + 
"                            <input type=\"radio\" name=\"c\" id=\"nc\" value=\"nc\">\n" + 
"                            ");// line 50, japidviews\Application\profile\License.html
		;p(getMessage("no"));// line 54, japidviews\Application\profile\License.html
		p("                        </label>\n" + 
"\n" + 
"\n" + 
"                    </div>\n" + 
"\n" + 
"\n" + 
"                    <div class=\"form-group\">\n" + 
"\n" + 
"                        <button type=\"submit\" class=\"btn\">\n" + 
"                            ");// line 54, japidviews\Application\profile\License.html
		;p(getMessage("save.change"));// line 64, japidviews\Application\profile\License.html
		p("                        </button>\n" + 
"\n" + 
"                    </div>\n" + 
"                    <h3>你选择的许可协议</h3>\n" + 
"\n" + 
"                    <h4 id=\"cc\" class=\"cc\">\n" + 
"                    </h4>\n" + 
"\n" + 
"\n" + 
"                </form>\n" + 
"\n" + 
"            </div>\n" + 
"\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"    <div class=\"col col_3\">\n" + 
"        <div class=\" \">\n" + 
"\n" + 
"\n" + 
"        </div>\n" + 
"\n" + 
"\n" + 
"    </div>\n" + 
"    <div class=\"col col_13\">\n" + 
"        <div class=\"row-fluid  \">\n" + 
"\n" + 
"            <div class=\"col-lg-12 well\">\n" + 
"                <h3>知识共享协议 3.0 (Creative Commons 3.0)</h3>\n" + 
"\n" + 
"                <P>\n" + 
"                    <img src=\"/public/images/cc/cc.png\" class=\"img\">\n" + 
"                    本网站发布的所有内容均采用CC协议3.0,详细内容：\n" + 
"                <ul>\n" + 
"                    <li>查看 <a href=\"http://creativecommons.net.cn/licenses/meet-the-licenses/\">知识共享许可协议文本</a></li>\n" + 
"                    <li>查看 <a href=\"http://creativecommons.net.cn/licenses/licenses_exp/\">许可协议说明</a></li>\n" + 
"                </ul>\n" + 
"                </P>\n" + 
"\n" + 
"\n" + 
"                <br/>\n" + 
"\n" + 
"                <P>\n" + 
"                <h4>简要协议说明：</h4>\n" + 
"\n" + 
"                <div class=\"note\">\n" + 
"\n" + 
"                    <img src=\"/public/images/cc/by.png\" class=\"img\">\n" + 
"                    <strong> 署名：</strong> 您允许他人对自己享有著作权的作品及演绎作品进行复制、发行、展览、表演、放映、广播或通过信息网络向公众传播，但在这些过程中对方必须保留您对原作品的署名。\n" + 
"                </div>\n" + 
"                <div class=\"note\">\n" + 
"                    <img src=\"/public/images/cc/nc.png\" class=\"img\">\n" + 
"                    <strong> 非商业性使用：</strong>您允许他人对您享有著作权的作品及演绎作品进行复制、发行、展览、表演、放映、广播或通过信息网络向公众传播，但仅限于非商业性目的。\n" + 
"\n" + 
"                </div>\n" + 
"                <div class=\"note\">\n" + 
"\n" + 
"                    <img src=\"/public/images/cc/nd.png\" class=\"img\">\n" + 
"                    <strong> 禁止演绎：</strong>您允许他人对您的作品原封不动地进行复制、发行、展览、表演、放映、广播或通过信息网络向公众传播，但不得进行演绎创作。\n" + 
"                </div>\n" + 
"                <div class=\"note\">\n" + 
"                    <img src=\"/public/images/cc/sa.png\" class=\"img\">\n" + 
"                    <strong> 相同方式共享：</strong>只有在他人对演绎作品使用与您的原作品相同的许可协议的情况下，您才允许他人发行其演绎作品。\n" + 
"\n" + 
"\n" + 
"                </div>\n" + 
"                <div class=\"note\"> 注：许可协议协议不能同时包含“相同方式共享”和“禁止演绎”许可要素，“相同方式共享”要素仅适用于演绎作品。</div>\n" + 
"                </P>\n" + 
"            </div>\n" + 
"\n" + 
"\n" + 
"        </div>\n" + 
"\n" + 
"    </div>\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"\n");// line 64, japidviews\Application\profile\License.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p(i18n("license.title"));;
	}
	@Override protected void css() {
		// line 5, japidviews\Application\profile\License.html
		p("<script type=\"text/javascript\" src=\"");// line 5, japidviews\Application\profile\License.html
		p(lookupStatic("/public/app/license.js"));// line 6, japidviews\Application\profile\License.html
		p("\"></script>\n" + 
"\n");// line 6, japidviews\Application\profile\License.html
		;
	}
	@Override protected void header() {
		p("set License");;
	}
}