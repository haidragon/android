package com.allen.rujews.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class allen implements Plugin<Project>{

    @Override
    void apply(Project target) {
        target.task('allen') << {
            println "fuck必须实现apply 也就是 apply plugin:时会调用"
        }
    }
}
