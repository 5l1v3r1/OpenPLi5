DESCRIPTION = "Signal finder for DVB-S2 tuners"
HOMEPAGE = "https://github.com/Dima73/enigma2-plugin-signalfinder"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://src/__init__.py;md5=4d83900521db5f5d59df5d45c5823475"
SRC_URI = "git://github.com/Dima73/enigma2-plugin-signalfinder.git"
S = "${WORKDIR}/git"

inherit gitpkgv
SRCREV = "ae9f5ef9b4941e7462d9aee9002a4aaf2c86fd88"
PV = "1+git${SRCPV}"
PKGV = "1+git${GITPKGV}"

inherit allarch distutils-openplugins
