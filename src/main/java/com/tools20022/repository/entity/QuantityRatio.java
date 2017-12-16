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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ratio expressed as a quotient of quantities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuantityRatio" src="doc-files/QuantityRatio.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForResultantSecuritiesProceedsDefinition
 * QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmQuantity1
 * QuantityRatio.mmQuantity1}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmQuantity2
 * QuantityRatio.mmQuantity2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition
 * QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToOldProceedsDefinition
 * QuantityRatio.mmNewToOldProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmNewToUnderlyingProceedsDefinition
 * QuantityRatio.mmNewToUnderlyingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#mmIntermediateSecuritiesProceedsDefinition
 * QuantityRatio.mmIntermediateSecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmwarrant
 * QuantityRatio.mmwarrant}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmWarrantParity
 * Warrant.mmWarrantParity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
 * SecuritiesProceedsDefinition.
 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
 * SecuritiesProceedsDefinition.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesToUnderlyingRatio
 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantityRatio"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Ratio expressed as a quotient of quantities."</li>
 * </ul>
 */
public class QuantityRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesProceedsDefinition additionalQuantityForResultantSecuritiesProceedsDefinition;
	/**
	 * Securities proceeds for which an additional quantity for subscribed
	 * resultant securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForResultantSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an additional quantity for subscribed resultant securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalQuantityForResultantSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForResultantSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for subscribed resultant securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected DecimalNumber quantity1;
	/**
	 * Numerator of the quotient of quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numerator of the quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuantity1 = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity1";
			definition = "Numerator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return QuantityRatio.class.getMethod("getQuantity1", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber quantity2;
	/**
	 * Denominator of the quotient of quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denominator of the quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuantity2 = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity2";
			definition = "Denominator of the quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return QuantityRatio.class.getMethod("getQuantity2", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesProceedsDefinition additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	/**
	 * Securities proceeds for which an additional quantity for existing
	 * securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an additional quantity for existing securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for existing securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition newToOldProceedsDefinition;
	/**
	 * Securities procceds for which a nwe to old ratio is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
	 * SecuritiesProceedsDefinition.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOldProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities procceds for which a nwe to old ratio is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewToOldProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToOldProceedsDefinition";
			definition = "Securities procceds for which a nwe to old ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewToOld;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition newToUnderlyingProceedsDefinition;
	/**
	 * Securities proceeds for which a new to underlying ratio is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
	 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToUnderlyingProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a new to underlying ratio is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNewToUnderlyingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToUnderlyingProceedsDefinition";
			definition = "Securities proceeds for which a new to underlying ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected SecuritiesProceedsDefinition intermediateSecuritiesProceedsDefinition;
	/**
	 * Securities proceeds for which a quantity of intermediate securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesToUnderlyingRatio
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a quantity of intermediate securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIntermediateSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which a quantity of intermediate securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmObject();
		}
	};
	protected Warrant warrant;
	/**
	 * Provides the warrant for the related quantity or the underlying quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmWarrantParity
	 * Warrant.mmWarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the warrant for the related quantity or the underlying quantity. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmwarrant = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "warrant";
			definition = "Provides the warrant for the related quantity or the underlying quantity. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.mmWarrantParity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityRatio";
				definition = "Ratio expressed as a quotient of quantities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.mmWarrantParity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmQuantity1,
						com.tools20022.repository.entity.QuantityRatio.mmQuantity2, com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmNewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmNewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmIntermediateSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmwarrant);
			}

			@Override
			public Class<?> getInstanceClass() {
				return QuantityRatio.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesProceedsDefinition getAdditionalQuantityForResultantSecuritiesProceedsDefinition() {
		return additionalQuantityForResultantSecuritiesProceedsDefinition;
	}

	public void setAdditionalQuantityForResultantSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition additionalQuantityForResultantSecuritiesProceedsDefinition) {
		this.additionalQuantityForResultantSecuritiesProceedsDefinition = additionalQuantityForResultantSecuritiesProceedsDefinition;
	}

	public DecimalNumber getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(DecimalNumber quantity1) {
		this.quantity1 = quantity1;
	}

	public DecimalNumber getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(DecimalNumber quantity2) {
		this.quantity2 = quantity2;
	}

	public SecuritiesProceedsDefinition getAdditionalQuantityForSubscribedSecuritiesProceedsDefinition() {
		return additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	}

	public void setAdditionalQuantityForSubscribedSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition additionalQuantityForSubscribedSecuritiesProceedsDefinition) {
		this.additionalQuantityForSubscribedSecuritiesProceedsDefinition = additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getNewToOldProceedsDefinition() {
		return newToOldProceedsDefinition;
	}

	public void setNewToOldProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition newToOldProceedsDefinition) {
		this.newToOldProceedsDefinition = newToOldProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getNewToUnderlyingProceedsDefinition() {
		return newToUnderlyingProceedsDefinition;
	}

	public void setNewToUnderlyingProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition newToUnderlyingProceedsDefinition) {
		this.newToUnderlyingProceedsDefinition = newToUnderlyingProceedsDefinition;
	}

	public SecuritiesProceedsDefinition getIntermediateSecuritiesProceedsDefinition() {
		return intermediateSecuritiesProceedsDefinition;
	}

	public void setIntermediateSecuritiesProceedsDefinition(com.tools20022.repository.entity.SecuritiesProceedsDefinition intermediateSecuritiesProceedsDefinition) {
		this.intermediateSecuritiesProceedsDefinition = intermediateSecuritiesProceedsDefinition;
	}

	public Warrant getwarrant() {
		return warrant;
	}

	public void setwarrant(com.tools20022.repository.entity.Warrant warrant) {
		this.warrant = warrant;
	}
}