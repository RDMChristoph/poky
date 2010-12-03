SUMMARY = "Resource discovery and announcement over SSDP"
DESCRIPTION = "GSSDP implements resource discovery and announcement over SSDP (Simpe Service Discovery Protocol)."
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bf50002aefd002f49e7bb854063f7e7"
DEPENDS = "glib-2.0 libsoup-2.4 libglade"

SRC_URI = "http://gupnp.org/sites/all/files/sources/${PN}-${PV}.tar.gz"

inherit autotools pkgconfig

PACKAGES =+ "gssdp-tools"

FILES_gssdp-tools = "${bindir}/gssdp* ${datadir}/gssdp/*.glade"

SRC_URI[md5sum] = "8605138eac1e7fb8ec8cf502a928ea81"
SRC_URI[sha256sum] = "6e4de2ecc90d2ac8b3694af1954984d04de25fb01dd2f2748d7221add8ead9e0"
