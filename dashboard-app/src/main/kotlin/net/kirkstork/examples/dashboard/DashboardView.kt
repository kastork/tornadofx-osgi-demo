package net.kirkstork.examples.dashboard

import tornadofx.*
import tornadofx.osgi.addViewsWhen

class DashboardView : View("Dashboard") {
	override val root = vbox {
		setPrefSize(900.0, 600.0)
		addViewsWhen { it.discriminator == "dashboard" }
		label(title) {
			addClass(heading)
		}
	}
}
