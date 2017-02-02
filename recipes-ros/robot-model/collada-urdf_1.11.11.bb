DESCRIPTION = "This package contains a tool to convert Unified Robot Description Format (URDF) \
documents into COLLAborative Design Activity (COLLADA) documents."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles assimp resource-retriever collada-dom collada-parser roscpp urdf geometric-shapes tf"

require robot-model.inc
