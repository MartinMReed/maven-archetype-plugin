package com.yourcompany.maven.lolwut;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.yourcompany.maven.core.JoJoMojoImpl;

/**
 * @goal prepare-package
 * @phase prepare-package
 */
public final class PreparePackageMojo extends JoJoMojoImpl {

    @Override
    public final void execute() throws MojoExecutionException, MojoFailureException {

        // http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
        // 
        // perform any operations necessary to prepare a package before the actual packaging.
        // This often results in an unpacked, processed version of the package. (Maven 2.1 and above)
        // 
    }
}
