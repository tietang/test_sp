package japidviews.Application.photo;

import fengfei.fir.model.PhotoShow;
import fengfei.fir.utils.Path;
import fengfei.ucm.entity.photo.Rank;
import fengfei.ucm.entity.profile.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//
// NOTE: This file was generated from: japidviews/Application/photo/Yours.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class Yours extends japidviews._layouts.Layout
{
	public static final String sourceTemplate = "japidviews/Application/photo/Yours.html";
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


	public Yours() {
		super(null);
	}
	public Yours(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"pagePath", "photos", "pageNum", "user", "targets", "sources", "targetCount", "sourceCount", "rank",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<? extends PhotoShow>", "int", "User", "List<Long>", "List<Long>", "int", "int", "Rank",  };
	public static final Object[] argDefaults= new Object[] {null,null,null,null,null,null,null,null,null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.photo.Yours.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private String pagePath; // line 5, japidviews/Application/photo/Yours.html
	private List<? extends PhotoShow> photos; // line 5, japidviews/Application/photo/Yours.html
	private int pageNum; // line 5, japidviews/Application/photo/Yours.html
	private User user; // line 5, japidviews/Application/photo/Yours.html
	private List<Long> targets; // line 5, japidviews/Application/photo/Yours.html
	private List<Long> sources; // line 5, japidviews/Application/photo/Yours.html
	private int targetCount; // line 5, japidviews/Application/photo/Yours.html
	private int sourceCount; // line 5, japidviews/Application/photo/Yours.html
	private Rank rank; // line 5, japidviews/Application/photo/Yours.html
	public cn.bran.japid.template.RenderResult render(String pagePath,List<? extends PhotoShow> photos,int pageNum,User user,List<Long> targets,List<Long> sources,int targetCount,int sourceCount,Rank rank) {
		this.pagePath = pagePath;
		this.photos = photos;
		this.pageNum = pageNum;
		this.user = user;
		this.targets = targets;
		this.sources = sources;
		this.targetCount = targetCount;
		this.sourceCount = sourceCount;
		this.rank = rank;
		long __t = -1;
		try {super.layout();} catch (RuntimeException e) { super.handleException(e);} // line 5, japidviews/Application/photo/Yours.html
		return new cn.bran.japid.template.RenderResultPartial(getHeaders(), getOut(), __t, actionRunners, sourceTemplate);
	}

	public static cn.bran.japid.template.RenderResult apply(String pagePath,List<? extends PhotoShow> photos,int pageNum,User user,List<Long> targets,List<Long> sources,int targetCount,int sourceCount,Rank rank) {
		return new Yours().render(pagePath, photos, pageNum, user, targets, sources, targetCount, sourceCount, rank);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
//------
p("<pre style=\"display: none\">\n");// line 1, japidviews\Application\photo\Yours.html
// line 8, japidviews\Application\photo\Yours.html
		p("</pre>\n" + 
"\n");// line 9, japidviews\Application\photo\Yours.html
		System.out.println(user);// line 12, japidviews\Application\photo\Yours.html
		p("\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"\n" + 
"<div class=\"grid_row yours\">\n" + 
"	<div class=\"col col_4\">\n" + 
"		<div class=\"row-fluid card \"  >\n" + 
"			<div class=\"span6 first\">\n" + 
"				<img width=\"95\" height=\"95\" class=\"img-rounded\"\n" + 
"				src=\"");// line 12, japidviews\Application\photo\Yours.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(user.idUser));// line 24, japidviews\Application\photo\Yours.html
		p("\">\n" + 
"			</div>\n" + 
"			<div class=\"span6\">\n" + 
"				<div class=\" \">\n" + 
"					<div>\n" + 
"						<strong>");// line 24, japidviews\Application\photo\Yours.html
		p(user.niceName);// line 29, japidviews\Application\photo\Yours.html
		p("</strong>\n" + 
"					</div>\n" + 
"					<div>\n" + 
"						<a href=\"/settings/profile\" class=\"btn btn-small\">Edit Profile</a>\n" + 
"					</div>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"span12 first\" >\n" + 
"				<div class=\"line10 hr1\"></div>\n" + 
"				<div class=\"line10\"></div>\n" + 
"				个人介绍\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"		<div class=\"row-fluid card \">\n" + 
"			<div class=\"span6 affection\">\n" + 
"				<div>\n" + 
"					<strong>");// line 29, japidviews\Application\photo\Yours.html
		p(rank.affection);// line 46, japidviews\Application\photo\Yours.html
		p("</strong>\n" + 
"				</div>\n" + 
"				<div>\n" + 
"					Affection\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			<div class=\"span6 photo_stats\">\n" + 
"				<ul >\n" + 
"\n" + 
"					<li title=\"Views\">\n" + 
"						<small class=\"key\" >Views</small><strong class=\"value\">");// line 46, japidviews\Application\photo\Yours.html
		p(rank.view);// line 56, japidviews\Application\photo\Yours.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"Votes\">\n" + 
"						<small class=\"key\">Votes</small><strong class=\"value\">");// line 56, japidviews\Application\photo\Yours.html
		p(rank.vote);// line 59, japidviews\Application\photo\Yours.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"Favorites\">\n" + 
"						<small class=\"key\">Favorites</small><strong class=\"value\">");// line 59, japidviews\Application\photo\Yours.html
		p(rank.favorite);// line 62, japidviews\Application\photo\Yours.html
		p("</strong>\n" + 
"					</li>\n" + 
"					<li title=\"comments\">\n" + 
"						<small class=\"key\">Comments</small><strong class=\"value\">");// line 62, japidviews\Application\photo\Yours.html
		p(rank.comment);// line 65, japidviews\Application\photo\Yours.html
		p("</strong>\n" + 
"					</li>\n" + 
"\n" + 
"				</ul>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		<div class=\" card map \"  >\n" + 
"			");// line 65, japidviews\Application\photo\Yours.html
		String location=user.toLocation();if(location.length()<=6) location="chengdu, China";// line 72, japidviews\Application\photo\Yours.html
		p("			<a href=\"http://maps.google.com/maps?spn=0.1,0.1&t=m&z=10&q=");// line 72, japidviews\Application\photo\Yours.html
		p(location);// line 73, japidviews\Application\photo\Yours.html
		p("\" target=\"_blank\"> <img alt=\"Staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers");// line 73, japidviews\Application\photo\Yours.html
		p(location);// line 73, japidviews\Application\photo\Yours.html
		p("\" src=\"http://maps.googleapis.com/maps/api/staticmap?size=280x100&amp;sensor=false&amp;zoom=6&amp;markers=");// line 73, japidviews\Application\photo\Yours.html
		p(location);// line 73, japidviews\Application\photo\Yours.html
		p("\" /> </a>\n" + 
"		</div>\n" + 
"\n" + 
"		<div class=\"card   \">\n" + 
"			<h6>Following (");// line 73, japidviews\Application\photo\Yours.html
		p(targetCount);// line 77, japidviews\Application\photo\Yours.html
		p(")</h6>\n" + 
"			<div class=\"onerow\">\n" + 
"				");// line 77, japidviews\Application\photo\Yours.html
		if(targets!=null){// line 79, japidviews\Application\photo\Yours.html
				for(long id: targets){// line 80, japidviews\Application\photo\Yours.html
		p("				<div class=\"col3\"><img class=\"img-rounded\"\n" + 
"					src=\"");// line 80, japidviews\Application\photo\Yours.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(id));// line 82, japidviews\Application\photo\Yours.html
		p("\">\n" + 
"				</div>\n" + 
"\n" + 
"				");// line 82, japidviews\Application\photo\Yours.html
		}// line 85, japidviews\Application\photo\Yours.html
				}// line 86, japidviews\Application\photo\Yours.html
		p("\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		<div class=\"card \">\n" + 
"			<h6>Followed (");// line 86, japidviews\Application\photo\Yours.html
		p(sourceCount);// line 91, japidviews\Application\photo\Yours.html
		p(")</h6>\n" + 
"			<div class=\"onerow\">\n" + 
"				");// line 91, japidviews\Application\photo\Yours.html
		if(sources!=null){// line 93, japidviews\Application\photo\Yours.html
				for(Long id: sources){// line 94, japidviews\Application\photo\Yours.html
		p("				<div class=\"col3\"><img class=\"img-rounded\"\n" + 
"					src=\"");// line 94, japidviews\Application\photo\Yours.html
		p(fengfei.spruce.utils.PhotoPathUtils.getUserPhotoDownloadPath(id));// line 96, japidviews\Application\photo\Yours.html
		p("\">\n" + 
"				</div>\n" + 
"\n" + 
"				");// line 96, japidviews\Application\photo\Yours.html
		}// line 99, japidviews\Application\photo\Yours.html
				}// line 100, japidviews\Application\photo\Yours.html
		p("\n" + 
"			</div>\n" + 
"		</div>\n" + 
"		<div class=\"card \">\n" + 
"			<div class=\"feeds\">\n" + 
"				RSS Feeds:\n" + 
"				<div>\n" + 
"					<a>");// line 100, japidviews\Application\photo\Yours.html
		p(user.niceName);// line 108, japidviews\Application\photo\Yours.html
		p("'s Photos</a>\n" + 
"				</div>\n" + 
"				<div>\n" + 
"					<a>");// line 108, japidviews\Application\photo\Yours.html
		p(user.niceName);// line 111, japidviews\Application\photo\Yours.html
		p("'s Favorites</a>\n" + 
"				</div>\n" + 
"				<div>\n" + 
"					<a>");// line 111, japidviews\Application\photo\Yours.html
		p(user.niceName);// line 114, japidviews\Application\photo\Yours.html
		p("'s Stories</a>\n" + 
"				</div>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"	</div>\n" + 
"	");// line 114, japidviews\Application\photo\Yours.html
		String action=fengfei.spruce.utils.WebUtils.getLastUrlWord(request.url);// line 119, japidviews\Application\photo\Yours.html
	Map actions=new HashMap();// line 120, japidviews\Application\photo\Yours.html
	actions.put(action,"class=\"active\"");// line 121, japidviews\Application\photo\Yours.html
		p("	<div class=\"col col_12 yours\">\n" + 
"		<div class=\"onerow\" >\n" + 
"			<div class=\"col20 nav_title  \" >\n" + 
"				<ul class=\"nav nav-pills \">\n" + 
"					<li ");// line 121, japidviews\Application\photo\Yours.html
		p(actions.get("home"));// line 126, japidviews\Application\photo\Yours.html
		p(">\n" + 
"						<a href=\"/yours/0/home\">Photos</a>\n" + 
"					</li>\n" + 
"					<li  ");// line 126, japidviews\Application\photo\Yours.html
		p(actions.get("story"));// line 129, japidviews\Application\photo\Yours.html
		p(">\n" + 
"						<a href=\"/yours/0/story\">Stories</a>\n" + 
"					</li>\n" + 
"					<li ");// line 129, japidviews\Application\photo\Yours.html
		p(actions.get("fav"));// line 132, japidviews\Application\photo\Yours.html
		p(">\n" + 
"						<a href=\"/yours/0/fav\">Favorites</a>\n" + 
"					</li>\n" + 
"					<li ");// line 132, japidviews\Application\photo\Yours.html
		p(actions.get("flow"));// line 135, japidviews\Application\photo\Yours.html
		p(">\n" + 
"						<a href=\"/yours/0/flow\">Flow</a>\n" + 
"					</li>\n" + 
"					<li ");// line 135, japidviews\Application\photo\Yours.html
		p(actions.get("stats"));// line 138, japidviews\Application\photo\Yours.html
		p(">\n" + 
"						<a href=\"/yours/0/stats\">Statistics</a>\n" + 
"					</li>\n" + 
"				</ul>\n" + 
"\n" + 
"			</div>\n" + 
"\n" + 
"		</div>\n" + 
"\n" + 
"		<div class=\"grid_row  previews\">\n" + 
"			");// line 138, japidviews\Application\photo\Yours.html
		for(PhotoShow photo : photos){// line 148, japidviews\Application\photo\Yours.html
		p("			<div class=\"col photo_col width_3\">\n" + 
"				<div class=\"photo_preview photo_preview_3\" >\n" + 
"					<a href=\"/show/");// line 148, japidviews\Application\photo\Yours.html
		p(photo.idPhoto);// line 151, japidviews\Application\photo\Yours.html
		p("_");// line 151, japidviews\Application\photo\Yours.html
		p(photo.idUser);// line 151, japidviews\Application\photo\Yours.html
		p("?from=");// line 151, japidviews\Application\photo\Yours.html
		p(pagePath);// line 151, japidviews\Application\photo\Yours.html
		p("\" target=\"photo_view\" ><img src=\"");// line 151, japidviews\Application\photo\Yours.html
		p(Path.getJpegDownloadPath(photo.idPhoto,1));// line 151, japidviews\Application\photo\Yours.html
		p("\" /></a>\n" + 
"					<div class=\"caption\">\n" + 
"						<div class=\"title\">\n" + 
"							<a href=\"/show/");// line 151, japidviews\Application\photo\Yours.html
		p(photo.idPhoto);// line 154, japidviews\Application\photo\Yours.html
		p("_");// line 154, japidviews\Application\photo\Yours.html
		p(photo.idUser);// line 154, japidviews\Application\photo\Yours.html
		p("?feature=");// line 154, japidviews\Application\photo\Yours.html
		p(pagePath);// line 154, japidviews\Application\photo\Yours.html
		p("\" target=\"photo_view\" >");// line 154, japidviews\Application\photo\Yours.html
		p(photo.title);// line 154, japidviews\Application\photo\Yours.html
		p("</a>\n" + 
"						</div>\n" + 
"						<div class=\"score\">\n" + 
"							");// line 154, japidviews\Application\photo\Yours.html
		p(photo.sscore);// line 157, japidviews\Application\photo\Yours.html
		p("						</div>\n" + 
"					</div>\n" + 
"\n" + 
"				</div>\n" + 
"			</div>\n" + 
"			");// line 157, japidviews\Application\photo\Yours.html
		}// line 163, japidviews\Application\photo\Yours.html
		p("\n" + 
"		</div>\n" + 
"		<div class=\" container\">\n" + 
"			<div class=\"col col_16 pager pagination-right\">\n" + 
"				<ul>\n" + 
"					<li>\n" + 
"						<a href=\"");// line 163, japidviews\Application\photo\Yours.html
		p(pagePath);// line 170, japidviews\Application\photo\Yours.html
		p("/");// line 170, japidviews\Application\photo\Yours.html
		p((pageNum-1<=0)?1:(pageNum-1));// line 170, japidviews\Application\photo\Yours.html
		p("\">Prev</a>\n" + 
"					</li>\n" + 
"					");// line 170, japidviews\Application\photo\Yours.html
		if(pageNum>=2){// line 172, japidviews\Application\photo\Yours.html
		p("					<li >\n" + 
"						<a href=\"");// line 172, japidviews\Application\photo\Yours.html
		p(pagePath);// line 174, japidviews\Application\photo\Yours.html
		p("/1\">First</a>\n" + 
"					</li>");// line 174, japidviews\Application\photo\Yours.html
		}// line 175, japidviews\Application\photo\Yours.html
		p("\n" + 
"					<!--	<li class=\"disabled\"><a href=\"#\">1</a></li>\n" + 
"					<li><a href=\"#\">2</a></li>\n" + 
"					<li><a href=\"#\">3</a></li>\n" + 
"					<li><a href=\"#\">4</a></li>\n" + 
"					<li><a href=\"#\">5</a></li>-->\n" + 
"					");// line 175, japidviews\Application\photo\Yours.html
		if(photos.size()>=20){// line 182, japidviews\Application\photo\Yours.html
		p("					<li>\n" + 
"						<a href=\"");// line 182, japidviews\Application\photo\Yours.html
		p(pagePath);// line 184, japidviews\Application\photo\Yours.html
		p("/");// line 184, japidviews\Application\photo\Yours.html
		p(photos.size()<20?pageNum:(pageNum+1));// line 184, japidviews\Application\photo\Yours.html
		p("\" >Next</a>\n" + 
"					</li>");// line 184, japidviews\Application\photo\Yours.html
		}// line 185, japidviews\Application\photo\Yours.html
		p("\n" + 
"				</ul>\n" + 
"			</div>\n" + 
"		</div>\n" + 
"\n" + 
"	</div>\n" + 
"</div>\n" + 
"\n");// line 185, japidviews\Application\photo\Yours.html
		
		endDoLayout(sourceTemplate);
	}

	@Override protected void title() {
		p( "Sprucy Your Page");;
	}
	@Override protected void css() {
		// line 8, japidviews\Application\photo\Yours.html
;
	}
	@Override protected void header() {
		p( "Yours");;
	}
}