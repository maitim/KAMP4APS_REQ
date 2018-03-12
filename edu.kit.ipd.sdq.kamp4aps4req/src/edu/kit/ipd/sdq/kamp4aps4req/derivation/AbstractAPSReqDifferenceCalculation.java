package edu.kit.ipd.sdq.kamp4aps4req.derivation;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;

import edu.kit.ipd.sdq.kamp.workplan.Activity;


import java.util.List;


/**
 * Abstract Adapter class. Implementation in subclasses.
 * @author Timo Maier
 *
 * @param <T>
 */
public abstract class AbstractAPSReqDifferenceCalculation<T extends AbstractArchitectureVersion<?>> extends AbstractDifferenceCalculation<T>{

	@Override
	public abstract List<Activity> deriveWorkplan(T baseVersion, T TargetVersion);
	
	
}
