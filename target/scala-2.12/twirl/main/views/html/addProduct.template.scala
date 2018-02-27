
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'enctype -> "multipart/form-data")/*7.39*/ {_display_(Seq[Any](format.raw/*7.41*/("""
        """),format.raw/*8.37*/("""
        """),_display_(/*9.10*/CSRF/*9.14*/.formField),format.raw/*9.24*/("""

        """),_display_(/*11.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*11.85*/("""
        """),_display_(/*12.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*17.10*/("""
        """),_display_(/*18.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*18.99*/("""
        """),_display_(/*19.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*19.87*/("""
        """),_display_(/*20.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*20.87*/("""

        """),_display_(/*22.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.74*/("""

        """),format.raw/*24.9*/("""<label>Image Upload</label>
        <input class ="btn-sm btn-default" type="file" name ="upload">
        <br><br>
        
        <div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.index(0)),format.raw/*30.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*34.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 02:19:34 GMT 2018
                  SOURCE: /home/wdd/webapps/Lab1/PlayLab/lab1/app/views/addProduct.scala.html
                  HASH: 01d86dfd75b3e4ef0a4002794273a1fdec76b314
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1533->293|1572->295|1608->332|1644->342|1656->346|1686->356|1724->367|1820->442|1857->452|2114->688|2151->698|2261->787|2298->797|2396->874|2433->884|2531->961|2569->972|2654->1036|2691->1046|2980->1308|2995->1314|3040->1338|3188->1456
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|39->7|39->7|40->8|41->9|41->9|41->9|43->11|43->11|44->12|49->17|50->18|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|62->30|62->30|62->30|66->34
                  -- GENERATED --
              */
          