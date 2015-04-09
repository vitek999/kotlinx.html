package html4k

import html4k.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

enum public class RunAt(override val realValue : String) : AttributeEnum {
    server : RunAt("server")
}

val runAtValues : Map<String, RunAt> = RunAt.values().toMap { it.realValue }
enum public class Dir(override val realValue : String) : AttributeEnum {
    ltr : Dir("ltr")
    rtl : Dir("rtl")
}

val dirValues : Map<String, Dir> = Dir.values().toMap { it.realValue }
enum public class Draggable(override val realValue : String) : AttributeEnum {
    true_ : Draggable("true")
    false_ : Draggable("false")
    auto : Draggable("auto")
}

val draggableValues : Map<String, Draggable> = Draggable.values().toMap { it.realValue }
public object ATarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

public object ARel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"
    val values : List<String> = listOf("alternate","appEndIx","bookmark","chapter","contentS","copyright","glossary","help","index","next","prev","section","start","stylesheet","subsection")
}

public object AType {
    val textAsp : String = "text/asp"
    val textAsa : String = "text/asa"
    val textCss : String = "text/css"
    val textHtml : String = "text/html"
    val textJavaScript : String = "text/javascript"
    val textPlain : String = "text/plain"
    val textScriptLet : String = "text/scriptlet"
    val textXComponent : String = "text/x-component"
    val textXHtmlInsertion : String = "text/x-html-insertion"
    val textXml : String = "text/xml"
    val values : List<String> = listOf("textAsp","textAsa","textCss","textHtml","textJavaScript","textPlain","textScriptLet","textXComponent","textXHtmlInsertion","textXml")
}

enum public class AreaShape(override val realValue : String) : AttributeEnum {
    rect : AreaShape("rect")
    circle : AreaShape("circle")
    poly : AreaShape("poly")
    default : AreaShape("default")
}

val areaShapeValues : Map<String, AreaShape> = AreaShape.values().toMap { it.realValue }
public object AreaTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

public object AreaRel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"
    val values : List<String> = listOf("alternate","appEndIx","bookmark","chapter","contentS","copyright","glossary","help","index","next","prev","section","start","stylesheet","subsection")
}

public object BaseTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

enum public class ButtonFormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData : ButtonFormEncType("multipart/form-data")
    applicationXWwwFormUrlEncoded : ButtonFormEncType("application/x-www-form-urlencoded")
    textPlain : ButtonFormEncType("text/plain")
}

val buttonFormEncTypeValues : Map<String, ButtonFormEncType> = ButtonFormEncType.values().toMap { it.realValue }
enum public class ButtonFormMethod(override val realValue : String) : AttributeEnum {
    get : ButtonFormMethod("get")
    post : ButtonFormMethod("post")
    put : ButtonFormMethod("put")
    delete : ButtonFormMethod("delete")
}

val buttonFormMethodValues : Map<String, ButtonFormMethod> = ButtonFormMethod.values().toMap { it.realValue }
public object ButtonFormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

enum public class ButtonType(override val realValue : String) : AttributeEnum {
    button : ButtonType("button")
    reset : ButtonType("reset")
    submit : ButtonType("submit")
}

val buttonTypeValues : Map<String, ButtonType> = ButtonType.values().toMap { it.realValue }
enum public class CommandType(override val realValue : String) : AttributeEnum {
    command : CommandType("command")
    checkBox : CommandType("checkbox")
    radio : CommandType("radio")
}

val commandTypeValues : Map<String, CommandType> = CommandType.values().toMap { it.realValue }
enum public class FormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData : FormEncType("multipart/form-data")
    applicationXWwwFormUrlEncoded : FormEncType("application/x-www-form-urlencoded")
    textPlain : FormEncType("text/plain")
}

val formEncTypeValues : Map<String, FormEncType> = FormEncType.values().toMap { it.realValue }
enum public class FormMethod(override val realValue : String) : AttributeEnum {
    get : FormMethod("get")
    post : FormMethod("post")
    put : FormMethod("put")
    delete : FormMethod("delete")
}

val formMethodValues : Map<String, FormMethod> = FormMethod.values().toMap { it.realValue }
public object FormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

public object IframeName {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

enum public class IframeSandbox(override val realValue : String) : AttributeEnum {
    allowSameOrigin : IframeSandbox("allow-same-origin")
    allowFormS : IframeSandbox("allow-forms")
    allowScriptS : IframeSandbox("allow-scripts")
}

val iframeSandboxValues : Map<String, IframeSandbox> = IframeSandbox.values().toMap { it.realValue }
enum public class InputType(override val realValue : String) : AttributeEnum {
    button : InputType("button")
    checkBox : InputType("checkbox")
    colOr : InputType("color")
    date : InputType("date")
    dateTime : InputType("datetime")
    dateTimeLocal : InputType("datetime-local")
    email : InputType("email")
    file : InputType("file")
    hidden : InputType("hidden")
    image : InputType("image")
    month : InputType("month")
    number : InputType("number")
    password : InputType("password")
    radio : InputType("radio")
    range : InputType("range")
    reset : InputType("reset")
    search : InputType("search")
    submit : InputType("submit")
    text : InputType("text")
    tel : InputType("tel")
    time : InputType("time")
    url : InputType("url")
    week : InputType("week")
}

val inputTypeValues : Map<String, InputType> = InputType.values().toMap { it.realValue }
enum public class InputFormEncType(override val realValue : String) : AttributeEnum {
    multipartFormData : InputFormEncType("multipart/form-data")
    applicationXWwwFormUrlEncoded : InputFormEncType("application/x-www-form-urlencoded")
    textPlain : InputFormEncType("text/plain")
}

val inputFormEncTypeValues : Map<String, InputFormEncType> = InputFormEncType.values().toMap { it.realValue }
enum public class InputFormMethod(override val realValue : String) : AttributeEnum {
    get : InputFormMethod("get")
    post : InputFormMethod("post")
    put : InputFormMethod("put")
    delete : InputFormMethod("delete")
}

val inputFormMethodValues : Map<String, InputFormMethod> = InputFormMethod.values().toMap { it.realValue }
public object InputFormTarget {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

enum public class KeyGenKeyType(override val realValue : String) : AttributeEnum {
    rsa : KeyGenKeyType("rsa")
}

val keyGenKeyTypeValues : Map<String, KeyGenKeyType> = KeyGenKeyType.values().toMap { it.realValue }
public object LinkRel {
    val alternate : String = "Alternate"
    val appEndIx : String = "Appendix"
    val bookmark : String = "Bookmark"
    val chapter : String = "Chapter"
    val contentS : String = "Contents"
    val copyright : String = "Copyright"
    val glossary : String = "Glossary"
    val help : String = "Help"
    val index : String = "Index"
    val next : String = "Next"
    val prev : String = "Prev"
    val section : String = "Section"
    val start : String = "Start"
    val stylesheet : String = "Stylesheet"
    val subsection : String = "Subsection"
    val values : List<String> = listOf("alternate","appEndIx","bookmark","chapter","contentS","copyright","glossary","help","index","next","prev","section","start","stylesheet","subsection")
}

public object LinkMedia {
    val screen : String = "screen"
    val print : String = "print"
    val tty : String = "tty"
    val tv : String = "tv"
    val projection : String = "projection"
    val handheld : String = "handheld"
    val braille : String = "braille"
    val aural : String = "aural"
    val all : String = "all"
    val values : List<String> = listOf("screen","print","tty","tv","projection","handheld","braille","aural","all")
}

public object LinkType {
    val textAsp : String = "text/asp"
    val textAsa : String = "text/asa"
    val textCss : String = "text/css"
    val textHtml : String = "text/html"
    val textJavaScript : String = "text/javascript"
    val textPlain : String = "text/plain"
    val textScriptLet : String = "text/scriptlet"
    val textXComponent : String = "text/x-component"
    val textXHtmlInsertion : String = "text/x-html-insertion"
    val textXml : String = "text/xml"
    val values : List<String> = listOf("textAsp","textAsa","textCss","textHtml","textJavaScript","textPlain","textScriptLet","textXComponent","textXHtmlInsertion","textXml")
}

enum public class MenuType(override val realValue : String) : AttributeEnum {
    context : MenuType("context")
    toolbar : MenuType("toolbar")
    list : MenuType("list")
}

val menuTypeValues : Map<String, MenuType> = MenuType.values().toMap { it.realValue }
public object MetaHttpEquiv {
    val contentLanguage : String = "content-language"
    val contentType : String = "content-type"
    val defaultStyle : String = "default-style"
    val refresh : String = "refresh"
    val values : List<String> = listOf("contentLanguage","contentType","defaultStyle","refresh")
}

public object ObjectName {
    val blank : String = "_blank"
    val parent : String = "_parent"
    val self : String = "_self"
    val top : String = "_top"
    val values : List<String> = listOf("blank","parent","self","top")
}

enum public class ScriptType(override val realValue : String) : AttributeEnum {
    textEcmaScript : ScriptType("text/ecmascript")
    textJavaScript : ScriptType("text/javascript")
    textJavaScript10 : ScriptType("text/javascript1.0")
    textJavaScript11 : ScriptType("text/javascript1.1")
    textJavaScript12 : ScriptType("text/javascript1.2")
    textJavaScript13 : ScriptType("text/javascript1.3")
    textJavaScript14 : ScriptType("text/javascript1.4")
    textJavaScript15 : ScriptType("text/javascript1.5")
    textJScript : ScriptType("text/jscript")
    textXJavaScript : ScriptType("text/x-javascript")
    textXEcmaScript : ScriptType("text/x-ecmascript")
    textVbScript : ScriptType("text/vbscript")
}

val scriptTypeValues : Map<String, ScriptType> = ScriptType.values().toMap { it.realValue }
public object StyleType {
    val textCss : String = "text/css"
    val values : List<String> = listOf("textCss")
}

public object StyleMedia {
    val screen : String = "screen"
    val print : String = "print"
    val tty : String = "tty"
    val tv : String = "tv"
    val projection : String = "projection"
    val handheld : String = "handheld"
    val braille : String = "braille"
    val aural : String = "aural"
    val all : String = "all"
    val values : List<String> = listOf("screen","print","tty","tv","projection","handheld","braille","aural","all")
}

enum public class TextAreaWrap(override val realValue : String) : AttributeEnum {
    hard : TextAreaWrap("hard")
    soft : TextAreaWrap("soft")
}

val textAreaWrapValues : Map<String, TextAreaWrap> = TextAreaWrap.values().toMap { it.realValue }
enum public class ThScope(override val realValue : String) : AttributeEnum {
    col : ThScope("col")
    colGroup : ThScope("colgroup")
    row : ThScope("row")
    rowGroup : ThScope("rowgroup")
}

val thScopeValues : Map<String, ThScope> = ThScope.values().toMap { it.realValue }