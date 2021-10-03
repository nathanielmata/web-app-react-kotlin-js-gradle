import react.*
import react.dom.*
import kotlinx.css.*
import styled.*


@JsExport
class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledH1 {
            css {
                fontFamily = "Helvetica"; "Arial"; "sans-serif";
            }
            +"KotlinConf Explorer"
        }
        div {
            h3 {
                +"Videos to watch"
            }
            videoList {
                videos = unwatchedVideos
            }

            h3 {
                +"Videos watched"
            }
            videoList {
                videos = watchedVideos
            }
        }
        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
            h3 {
                +"John Doe: Building and breaking things"
            }
            img {
                attrs {
                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                }
            }
        }

    }
}