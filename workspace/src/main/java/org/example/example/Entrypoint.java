package org.example.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class Entrypoint implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getLogger().lifecycle("org.example.gradleplugin applied successfully.");
    }

}
