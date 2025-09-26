/**
 */
package mm6_1.provider;

import java.util.Collection;
import java.util.List;

import mm6_1.Mm6_1Factory;
import mm6_1.Mm6_1Package;
import mm6_1.RoutesModel;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mm6_1.RoutesModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutesModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutesModelItemProvider(AdapterFactory adapterFactory) {
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

			addRoutesPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addShortestPathsPropertyDescriptor(object);
			addOrdersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Routes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoutesModel_routes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoutesModel_routes_feature",
								"_UI_RoutesModel_type"),
						Mm6_1Package.Literals.ROUTES_MODEL__ROUTES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoutesModel_location_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoutesModel_location_feature",
								"_UI_RoutesModel_type"),
						Mm6_1Package.Literals.ROUTES_MODEL__LOCATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Shortest Paths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortestPathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoutesModel_shortestPaths_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoutesModel_shortestPaths_feature",
								"_UI_RoutesModel_type"),
						Mm6_1Package.Literals.ROUTES_MODEL__SHORTEST_PATHS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RoutesModel_orders_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RoutesModel_orders_feature",
								"_UI_RoutesModel_type"),
						Mm6_1Package.Literals.ROUTES_MODEL__ORDERS, true, false, true, null, null, null));
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
			childrenFeatures.add(Mm6_1Package.Literals.ROUTES_MODEL__ROUTES);
			childrenFeatures.add(Mm6_1Package.Literals.ROUTES_MODEL__LOCATION);
			childrenFeatures.add(Mm6_1Package.Literals.ROUTES_MODEL__SHORTEST_PATHS);
			childrenFeatures.add(Mm6_1Package.Literals.ROUTES_MODEL__ORDERS);
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
	 * This returns RoutesModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoutesModel"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RoutesModel_type");
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

		switch (notification.getFeatureID(RoutesModel.class)) {
		case Mm6_1Package.ROUTES_MODEL__ROUTES:
		case Mm6_1Package.ROUTES_MODEL__LOCATION:
		case Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS:
		case Mm6_1Package.ROUTES_MODEL__ORDERS:
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

		newChildDescriptors.add(
				createChildParameter(Mm6_1Package.Literals.ROUTES_MODEL__ROUTES, Mm6_1Factory.eINSTANCE.createRoute()));

		newChildDescriptors.add(createChildParameter(Mm6_1Package.Literals.ROUTES_MODEL__LOCATION,
				Mm6_1Factory.eINSTANCE.createLocation()));

		newChildDescriptors.add(createChildParameter(Mm6_1Package.Literals.ROUTES_MODEL__SHORTEST_PATHS,
				Mm6_1Factory.eINSTANCE.createRoute()));

		newChildDescriptors.add(
				createChildParameter(Mm6_1Package.Literals.ROUTES_MODEL__ORDERS, Mm6_1Factory.eINSTANCE.createOrder()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == Mm6_1Package.Literals.ROUTES_MODEL__ROUTES
				|| childFeature == Mm6_1Package.Literals.ROUTES_MODEL__SHORTEST_PATHS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Mm6_1EditPlugin.INSTANCE;
	}

}
