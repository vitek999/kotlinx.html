package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class Q(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("q", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var cite : String
        get()  = attributeString_ffbab22b.get(this, "cite")
        set(newValue) {attributeString_ffbab22b.set(this, "cite", newValue)}


}
