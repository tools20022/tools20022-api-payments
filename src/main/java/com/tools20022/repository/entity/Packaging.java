/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical packaging of goods for transport.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Packaging" src="doc-files/Packaging.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#Quantity
 * Packaging.Quantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#PerPackageUnitQuantity
 * Packaging.PerPackageUnitQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#Transport
 * Packaging.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#PackagingName
 * Packaging.PackagingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#TotalConsignmentQuantity
 * Packaging.TotalConsignmentQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#TotalVolume
 * Packaging.TotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#TotalWeight
 * Packaging.TotalWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#RelatedLineItem
 * Packaging.RelatedLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#PackageType
 * Packaging.PackageType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#RelatedPackaging
 * ProductQuantity.RelatedPackaging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForUnitQuantity
 * ProductQuantity.PackagingForUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForConsignmentlQuantity
 * ProductQuantity.PackagingForConsignmentlQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForVolume
 * ProductQuantity.PackagingForVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForWeight
 * ProductQuantity.PackagingForWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Packaging
 * LineItem.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Packaging
 * Transport.Packaging}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Packaging"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical packaging of goods for transport."</li>
 * </ul>
 */
public class Packaging {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Number of packages for a supply chain trade delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#RelatedPackaging
	 * ProductQuantity.RelatedPackaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of packages for a  supply chain trade delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Quantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Number of packages for a  supply chain trade delivery.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.RelatedPackaging;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of units per package for a supply chain trade delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForUnitQuantity
	 * ProductQuantity.PackagingForUnitQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerPackageUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of units per package  for a supply chain trade delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PerPackageUnitQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PerPackageUnitQuantity";
			definition = "Number of units per package  for a supply chain trade delivery.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForUnitQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transport process which uses a specific packaging.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#Packaging
	 * Transport.Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transport process which uses a specific packaging."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Transport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process which uses a specific packaging.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.Packaging;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Name given to the type of supply chain packaging. For instance
	 * Halogenated Resin (PVC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name given to the type of supply chain packaging. For instance Halogenated Resin (PVC)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PackagingName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingName";
			definition = "Name given to the type of supply chain packaging. For instance Halogenated Resin (PVC).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Total quantity of packaging units, eg number of boxes, containers,
	 * pallets, etc
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForConsignmentlQuantity
	 * ProductQuantity.PackagingForConsignmentlQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalConsignmentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of packaging units, eg number of boxes, containers, pallets, etc"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TotalConsignmentQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalConsignmentQuantity";
			definition = "Total quantity of packaging units, eg number of boxes, containers, pallets, etc";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForConsignmentlQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total volume of goods shipped, eg number of cubic meters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForVolume
	 * ProductQuantity.PackagingForVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total volume of goods shipped, eg number of cubic meters."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TotalVolume = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalVolume";
			definition = "Total volume of goods shipped, eg number of cubic meters.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForVolume;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total weight of goods shipped, eg number of kg, tons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#PackagingForWeight
	 * ProductQuantity.PackagingForWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total weight of goods shipped, eg number of kg, tons."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TotalWeight = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalWeight";
			definition = "Total weight of goods shipped, eg number of kg, tons.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ProductQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.PackagingForWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Line item information for the package goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#Packaging
	 * LineItem.Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item information for the package goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Line item information for the package goods.";
			minOccurs = 0;
			type_lazy = () -> LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Packaging;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Code specifying the properties of packaging for the supply chain delivery
	 * of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Packaging
	 * Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code specifying the properties of packaging for the supply chain delivery of goods."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PackageType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Packaging.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackageType";
			definition = "Code specifying the properties of packaging for the supply chain delivery of goods.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Packaging";
				definition = "Physical packaging of goods for transport.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductQuantity.RelatedPackaging, com.tools20022.repository.entity.ProductQuantity.PackagingForUnitQuantity,
						com.tools20022.repository.entity.ProductQuantity.PackagingForConsignmentlQuantity, com.tools20022.repository.entity.ProductQuantity.PackagingForVolume,
						com.tools20022.repository.entity.ProductQuantity.PackagingForWeight, com.tools20022.repository.entity.LineItem.Packaging, com.tools20022.repository.entity.Transport.Packaging);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Packaging.Quantity, com.tools20022.repository.entity.Packaging.PerPackageUnitQuantity, com.tools20022.repository.entity.Packaging.Transport,
						com.tools20022.repository.entity.Packaging.PackagingName, com.tools20022.repository.entity.Packaging.TotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.TotalVolume,
						com.tools20022.repository.entity.Packaging.TotalWeight, com.tools20022.repository.entity.Packaging.RelatedLineItem, com.tools20022.repository.entity.Packaging.PackageType);
			}
		});
		return mmObject_lazy.get();
	}
}