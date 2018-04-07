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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.entity.LineItem;
import com.tools20022.repository.entity.ProductQuantity;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
 * Packaging.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#mmPerPackageUnitQuantity
 * Packaging.mmPerPackageUnitQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTransport
 * Packaging.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmPackagingName
 * Packaging.mmPackagingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
 * Packaging.mmTotalConsignmentQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
 * Packaging.mmTotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
 * Packaging.mmTotalWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmRelatedLineItem
 * Packaging.mmRelatedLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmPackageType
 * Packaging.mmPackageType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmRelatedPackaging
 * ProductQuantity.mmRelatedPackaging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForUnitQuantity
 * ProductQuantity.mmPackagingForUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForConsignmentlQuantity
 * ProductQuantity.mmPackagingForConsignmentlQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForVolume
 * ProductQuantity.mmPackagingForVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForWeight
 * ProductQuantity.mmPackagingForWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmPackaging
 * LineItem.mmPackaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPackaging
 * Transport.mmPackaging}</li>
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
	protected ProductQuantity quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmRelatedPackaging
	 * ProductQuantity.mmRelatedPackaging}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, ProductQuantity> mmQuantity = new MMBusinessAssociationEnd<Packaging, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Number of packages for a  supply chain trade delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmRelatedPackaging;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(Packaging obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Packaging obj, ProductQuantity value) {
			obj.setQuantity(value);
		}
	};
	protected ProductQuantity perPackageUnitQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForUnitQuantity
	 * ProductQuantity.mmPackagingForUnitQuantity}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, ProductQuantity> mmPerPackageUnitQuantity = new MMBusinessAssociationEnd<Packaging, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerPackageUnitQuantity";
			definition = "Number of units per package  for a supply chain trade delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmPackagingForUnitQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(Packaging obj) {
			return obj.getPerPackageUnitQuantity();
		}

		@Override
		public void setValue(Packaging obj, ProductQuantity value) {
			obj.setPerPackageUnitQuantity(value);
		}
	};
	protected Transport transport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPackaging
	 * Transport.mmPackaging}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, Transport> mmTransport = new MMBusinessAssociationEnd<Packaging, Transport>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Transport";
			definition = "Transport process which uses a specific packaging.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Transport.mmPackaging;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}

		@Override
		public Transport getValue(Packaging obj) {
			return obj.getTransport();
		}

		@Override
		public void setValue(Packaging obj, Transport value) {
			obj.setTransport(value);
		}
	};
	protected Max350Text packagingName;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Packaging, Max350Text> mmPackagingName = new MMBusinessAttribute<Packaging, Max350Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackagingName";
			definition = "Name given to the type of supply chain packaging. For instance Halogenated Resin (PVC).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Packaging obj) {
			return obj.getPackagingName();
		}

		@Override
		public void setValue(Packaging obj, Max350Text value) {
			obj.setPackagingName(value);
		}
	};
	protected ProductQuantity totalConsignmentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForConsignmentlQuantity
	 * ProductQuantity.mmPackagingForConsignmentlQuantity}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, ProductQuantity> mmTotalConsignmentQuantity = new MMBusinessAssociationEnd<Packaging, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalConsignmentQuantity";
			definition = "Total quantity of packaging units, eg number of boxes, containers, pallets, etc";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmPackagingForConsignmentlQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(Packaging obj) {
			return obj.getTotalConsignmentQuantity();
		}

		@Override
		public void setValue(Packaging obj, ProductQuantity value) {
			obj.setTotalConsignmentQuantity(value);
		}
	};
	protected ProductQuantity totalVolume;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForVolume
	 * ProductQuantity.mmPackagingForVolume}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, ProductQuantity> mmTotalVolume = new MMBusinessAssociationEnd<Packaging, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalVolume";
			definition = "Total volume of goods shipped, eg number of cubic meters.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmPackagingForVolume;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(Packaging obj) {
			return obj.getTotalVolume();
		}

		@Override
		public void setValue(Packaging obj, ProductQuantity value) {
			obj.setTotalVolume(value);
		}
	};
	protected ProductQuantity totalWeight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForWeight
	 * ProductQuantity.mmPackagingForWeight}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, ProductQuantity> mmTotalWeight = new MMBusinessAssociationEnd<Packaging, ProductQuantity>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalWeight";
			definition = "Total weight of goods shipped, eg number of kg, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ProductQuantity.mmPackagingForWeight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductQuantity.mmObject();
		}

		@Override
		public ProductQuantity getValue(Packaging obj) {
			return obj.getTotalWeight();
		}

		@Override
		public void setValue(Packaging obj, ProductQuantity value) {
			obj.setTotalWeight(value);
		}
	};
	protected List<LineItem> relatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmPackaging
	 * LineItem.mmPackaging}</li>
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
	public static final MMBusinessAssociationEnd<Packaging, List<LineItem>> mmRelatedLineItem = new MMBusinessAssociationEnd<Packaging, List<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Line item information for the package goods.";
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmPackaging;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public List<LineItem> getValue(Packaging obj) {
			return obj.getRelatedLineItem();
		}

		@Override
		public void setValue(Packaging obj, List<LineItem> value) {
			obj.setRelatedLineItem(value);
		}
	};
	protected Max4Text packageType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Packaging, Max4Text> mmPackageType = new MMBusinessAttribute<Packaging, Max4Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PackageType";
			definition = "Code specifying the properties of packaging for the supply chain delivery of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Max4Text getValue(Packaging obj) {
			return obj.getPackageType();
		}

		@Override
		public void setValue(Packaging obj, Max4Text value) {
			obj.setPackageType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Packaging";
				definition = "Physical packaging of goods for transport.";
				associationDomain_lazy = () -> Arrays.asList(ProductQuantity.mmRelatedPackaging, ProductQuantity.mmPackagingForUnitQuantity, ProductQuantity.mmPackagingForConsignmentlQuantity, ProductQuantity.mmPackagingForVolume,
						ProductQuantity.mmPackagingForWeight, LineItem.mmPackaging, Transport.mmPackaging);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Packaging.mmQuantity, com.tools20022.repository.entity.Packaging.mmPerPackageUnitQuantity, com.tools20022.repository.entity.Packaging.mmTransport,
						com.tools20022.repository.entity.Packaging.mmPackagingName, com.tools20022.repository.entity.Packaging.mmTotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.mmTotalVolume,
						com.tools20022.repository.entity.Packaging.mmTotalWeight, com.tools20022.repository.entity.Packaging.mmRelatedLineItem, com.tools20022.repository.entity.Packaging.mmPackageType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Packaging.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ProductQuantity getQuantity() {
		return quantity;
	}

	public Packaging setQuantity(ProductQuantity quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public ProductQuantity getPerPackageUnitQuantity() {
		return perPackageUnitQuantity;
	}

	public Packaging setPerPackageUnitQuantity(ProductQuantity perPackageUnitQuantity) {
		this.perPackageUnitQuantity = Objects.requireNonNull(perPackageUnitQuantity);
		return this;
	}

	public Transport getTransport() {
		return transport;
	}

	public Packaging setTransport(Transport transport) {
		this.transport = Objects.requireNonNull(transport);
		return this;
	}

	public Max350Text getPackagingName() {
		return packagingName;
	}

	public Packaging setPackagingName(Max350Text packagingName) {
		this.packagingName = Objects.requireNonNull(packagingName);
		return this;
	}

	public ProductQuantity getTotalConsignmentQuantity() {
		return totalConsignmentQuantity;
	}

	public Packaging setTotalConsignmentQuantity(ProductQuantity totalConsignmentQuantity) {
		this.totalConsignmentQuantity = Objects.requireNonNull(totalConsignmentQuantity);
		return this;
	}

	public ProductQuantity getTotalVolume() {
		return totalVolume;
	}

	public Packaging setTotalVolume(ProductQuantity totalVolume) {
		this.totalVolume = Objects.requireNonNull(totalVolume);
		return this;
	}

	public ProductQuantity getTotalWeight() {
		return totalWeight;
	}

	public Packaging setTotalWeight(ProductQuantity totalWeight) {
		this.totalWeight = Objects.requireNonNull(totalWeight);
		return this;
	}

	public List<LineItem> getRelatedLineItem() {
		return relatedLineItem == null ? relatedLineItem = new ArrayList<>() : relatedLineItem;
	}

	public Packaging setRelatedLineItem(List<LineItem> relatedLineItem) {
		this.relatedLineItem = Objects.requireNonNull(relatedLineItem);
		return this;
	}

	public Max4Text getPackageType() {
		return packageType;
	}

	public Packaging setPackageType(Max4Text packageType) {
		this.packageType = Objects.requireNonNull(packageType);
		return this;
	}
}