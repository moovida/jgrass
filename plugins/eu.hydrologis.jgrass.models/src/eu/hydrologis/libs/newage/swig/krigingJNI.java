/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package eu.hydrologis.libs.newage.swig;

class krigingJNI {
  public final static native int initializepoint(double[] jarg1, double[] jarg2, double[] jarg3, int jarg4);
  public final static native int initializegrid(double[] jarg1);
  public final static native int getValues(double[] jarg1, double[] jarg2, double[] jarg3, int jarg4, double[] jarg5, double[] jarg6);
  public final static native int finish();
}