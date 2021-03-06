/*
 * Copyright (c) 2007-2010 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.concurrentinc.com/
 */

package riffle.process;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation Process is used to flag a class as a riffle process type.
 * <p/>
 * All classes that declare the Process annotation must also implement methods that satisfy the contracts
 * defined by the riffle.process package method level annotations.
 *
 * @see ProcessPrepare
 * @see ProcessStart
 * @see ProcessStop
 * @see ProcessComplete
 * @see ProcessCleanup
 * @see DependencyOutgoing
 * @see DependencyIncoming
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Process
  {
  }
