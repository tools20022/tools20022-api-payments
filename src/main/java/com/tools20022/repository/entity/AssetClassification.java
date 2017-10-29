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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ProductTypeCode;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Other classification type of the security, ie, other than ISO 10962.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetClassification" src="doc-files/AssetClassification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#ClassificationType
 * AssetClassification.ClassificationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#Asset
 * AssetClassification.Asset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#Language
 * AssetClassification.Language}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#AssetClassScheme
 * AssetClassification.AssetClassScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#ProductType
 * AssetClassification.ProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#Strategy
 * AssetClassification.Strategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetClassification
 * Asset.AssetClassification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#AssetClassification
 * Scheme.AssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#AssetClass
 * AssetClassStrategy.AssetClass}</li>
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
 * "AssetClassification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Other classification type of the security, ie, other than ISO 10962."</li>
 * </ul>
 */
public class AssetClassification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI) codification, for example,
	 * common share with voting rights, fully paid, or registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClassificationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}
	};
	/**
	 * Asset for which classification information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#AssetClassification
	 * Asset.AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which classification information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Asset for which classification information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Language in which the asset classification is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which the asset classification is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the asset classification is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Information regarding the entity that assigns the asset classification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#AssetClassification
	 * Scheme.AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding the entity that assigns the asset classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetClassScheme = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClassScheme";
			definition = "Information regarding the entity that assigns the asset classification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Scheme.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.AssetClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the product type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProductType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductType";
			definition = "Identifies the product type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProductTypeCode.mmObject();
		}
	};
	/**
	 * Strategy related to a class of assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#AssetClass
	 * AssetClassStrategy.AssetClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassStrategy
	 * AssetClassStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to a class of assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to a class of assets.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AssetClassStrategy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassStrategy.AssetClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassification";
				definition = "Other classification type of the security, ie, other than ISO 10962.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetClassification, com.tools20022.repository.entity.Scheme.AssetClassification,
						com.tools20022.repository.entity.AssetClassStrategy.AssetClass);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.ClassificationType, com.tools20022.repository.entity.AssetClassification.Asset,
						com.tools20022.repository.entity.AssetClassification.Language, com.tools20022.repository.entity.AssetClassification.AssetClassScheme, com.tools20022.repository.entity.AssetClassification.ProductType,
						com.tools20022.repository.entity.AssetClassification.Strategy);
			}
		});
		return mmObject_lazy.get();
	}
}