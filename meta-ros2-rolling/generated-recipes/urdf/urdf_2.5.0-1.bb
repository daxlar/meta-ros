# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description     Format (URDF), which is an XML format for representing a robot model.     The code API of the parser has been through our review process and will remain     backwards compatible in future releases."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
ROS_AUTHOR = "Ioan Sucan <isucan@gmail.com>"
HOMEPAGE = "https://github.com/ros2/urdf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "urdf"
ROS_BPN = "urdf"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    tinyxml2-vendor \
    urdf-parser-plugin \
    urdfdom \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    urdf-parser-plugin \
    urdfdom \
    urdfdom-headers \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    tinyxml2-vendor \
    urdfdom \
    urdfdom-headers \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-google-benchmark \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/urdf-release/archive/release/rolling/urdf/2.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/urdf"
SRC_URI = "git://github.com/ros2-gbp/urdf-release;${ROS_BRANCH};protocol=https"
SRCREV = "3f05b52cfc4a55d1842af041d909ec57956b287e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}