# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "RViz plugin for displaying grid map messages."
AUTHOR = "Maximilian Wulf <mwulf@anybotics.com>"
ROS_AUTHOR = "Philipp Krüsi <philipp.kruesi@mavt.ethz.ch>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "grid_map"
ROS_BPN = "grid_map_rviz_plugin"

ROS_BUILD_DEPENDS = " \
    grid-map-msgs \
    grid-map-ros \
    qtbase \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    grid-map-msgs \
    grid-map-ros \
    qtbase \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    grid-map-msgs \
    grid-map-ros \
    qtbase \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/anybotics/grid_map-release/archive/release/noetic/grid_map_rviz_plugin/1.6.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/grid_map_rviz_plugin"
SRC_URI = "git://github.com/anybotics/grid_map-release;${ROS_BRANCH};protocol=https"
SRCREV = "c4ad780febe10994ede6181462e0e0b734867b9b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
