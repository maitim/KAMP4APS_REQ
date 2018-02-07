package edu.kit.ipd.sdq.kamp4aps4req.core;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractKAMP4aPS4ReqModificationRepository;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;
import options.OptionRepository;
import options.OptionsFactory;

/**
 * Class representing an @code{APSReqArchitectureVersion}. Super class of the software and hardware parts.
 * This class is abstract since either a model of the software or the hardware can be created.
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqArchitectureVersion extends AbstractArchitectureVersion<AbstractKAMP4aPS4ReqModificationRepository<?>> {

		protected ReqRepository requirementsRepository;
		protected DecisionRepository decisionRepository;
		protected OptionRepository optionRepository;

		
		public AbstractAPSReqArchitectureVersion(String name, ReqRepository requirementsRepository, DecisionRepository decisionRepository,
				OptionRepository optionRepository, AbstractKAMP4aPS4ReqModificationRepository<?> modificationMarksRepository) {
			
			super(name, modificationMarksRepository);
			if (requirementsRepository == null) {
				requirementsRepository = RequirementsFactory.eINSTANCE.createReqRepository();
			}
			this.setRequirementsRepository(requirementsRepository);
			if (decisionRepository == null) {
				decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
			}
			this.setDecisionRepository(decisionRepository);
			if (optionRepository == null) {
				optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
			}
			this.setOptionRepository(optionRepository);
		}


		public ReqRepository getRequirementsRepository() {
			return requirementsRepository;
		}


		public void setRequirementsRepository(ReqRepository requirementsRepository) {
			this.requirementsRepository = requirementsRepository;
		}


		public DecisionRepository getDecisionRepository() {
			return decisionRepository;
		}


		public void setDecisionRepository(DecisionRepository decisionRepository) {
			this.decisionRepository = decisionRepository;
		}


		public OptionRepository getOptionRepository() {
			return optionRepository;
		}


		public void setOptionRepository(OptionRepository optionRepository) {
			this.optionRepository = optionRepository;
		}
}