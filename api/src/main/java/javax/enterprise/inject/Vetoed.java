package javax.enterprise.inject;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Veto the processing of the class. Any beans or observer methods defined by this class will not be
 * installed.
 * </p>
 * 
 * <p>
 * When placed on package, all beans in the package are prevented from being installed.
 * </p>
 * 
 * <p>
 * No container lifecycle events are fired for classes annotated {@link Vetoed}.
 * </p>
 * 
 * @author Stuart Douglas
 * 
 */
@Target({ ElementType.TYPE, ElementType.PACKAGE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Vetoed {

}