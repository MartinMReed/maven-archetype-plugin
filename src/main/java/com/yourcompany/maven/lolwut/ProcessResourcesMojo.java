package com.yourcompany.maven.lolwut;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.yourcompany.maven.core.JoJoMojoImpl;

/**
 * @goal process-resources
 * @phase process-resources
 */
public final class ProcessResourcesMojo extends JoJoMojoImpl {

    @Override
    public final void execute() throws MojoExecutionException, MojoFailureException {

        // http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
        // 
        // copy and process the resources into the destination directory, ready for packaging.
        // 
    }
}
