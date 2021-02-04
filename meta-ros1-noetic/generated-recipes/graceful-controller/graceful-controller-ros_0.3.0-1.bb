# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A controller. Some say it might be graceful."
AUTHOR = "Michael Ferguson <mfergs7@gmail.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "graceful_controller"
ROS_BPN = "graceful_controller_ros"

ROS_BUILD_DEPENDS = " \
    angles \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    graceful-controller \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    graceful-controller \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    graceful-controller \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mikeferguson/graceful_controller-gbp/archive/release/noetic/graceful_controller_ros/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/graceful_controller_ros"
SRC_URI = "git://github.com/mikeferguson/graceful_controller-gbp;${ROS_BRANCH};protocol=https"
SRCREV = "386388f0e324c36492833b078837e96d94d7eb20"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
