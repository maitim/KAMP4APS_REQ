/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ChangePropagationStepItemProvider;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractAPSReqChangePropagationDueToSpecificationDependenciesItemProvider extends ChangePropagationStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAPSReqChangePropagationDueToSpecificationDependenciesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModificationmarksPackage.Literals.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AbstractAPSReqChangePropagationDueToSpecificationDependencies_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractAPSReqChangePropagationDueToSpecificationDependencies.class)) {
			case ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
			case ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
			case ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createAPSReqModifyDecision()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createAPSReqModifyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createAPSReqModifyOption()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}