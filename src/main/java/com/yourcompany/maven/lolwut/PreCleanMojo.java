package com.yourcompany.maven.lolwut;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.yourcompany.maven.core.JoJoMojoImpl;

/**
 * @goal pre-clean
 * @phase pre-clean
 */
public final class PreCleanMojo extends JoJoMojoImpl {

    @Override
    public final void execute() throws MojoExecutionException, MojoFailureException {

        // http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
        // 
        // executes processes needed prior to the actual project cleaning
        // 
    }
}
