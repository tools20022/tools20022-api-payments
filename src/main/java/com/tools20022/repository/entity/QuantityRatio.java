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
import com.tools20022.repository.entity.SecuritiesProceedsDefinition;
import com.tools20022.repository.entity.Warrant;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#mmWarrant
 * QuantityRatio.mmWarrant}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition> mmAdditionalQuantityForResultantSecuritiesProceedsDefinition = new MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForResultantSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for subscribed resultant securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(QuantityRatio obj) {
			return obj.getAdditionalQuantityForResultantSecuritiesProceedsDefinition();
		}

		@Override
		public void setValue(QuantityRatio obj, SecuritiesProceedsDefinition value) {
			obj.setAdditionalQuantityForResultantSecuritiesProceedsDefinition(value);
		}
	};
	protected DecimalNumber quantity1;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<QuantityRatio, DecimalNumber> mmQuantity1 = new MMBusinessAttribute<QuantityRatio, DecimalNumber>() {
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

		@Override
		public DecimalNumber getValue(QuantityRatio obj) {
			return obj.getQuantity1();
		}

		@Override
		public void setValue(QuantityRatio obj, DecimalNumber value) {
			obj.setQuantity1(value);
		}
	};
	protected DecimalNumber quantity2;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<QuantityRatio, DecimalNumber> mmQuantity2 = new MMBusinessAttribute<QuantityRatio, DecimalNumber>() {
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

		@Override
		public DecimalNumber getValue(QuantityRatio obj) {
			return obj.getQuantity2();
		}

		@Override
		public void setValue(QuantityRatio obj, DecimalNumber value) {
			obj.setQuantity2(value);
		}
	};
	protected SecuritiesProceedsDefinition additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition> mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition = new MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for existing securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(QuantityRatio obj) {
			return obj.getAdditionalQuantityForSubscribedSecuritiesProceedsDefinition();
		}

		@Override
		public void setValue(QuantityRatio obj, SecuritiesProceedsDefinition value) {
			obj.setAdditionalQuantityForSubscribedSecuritiesProceedsDefinition(value);
		}
	};
	protected SecuritiesProceedsDefinition newToOldProceedsDefinition;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition> mmNewToOldProceedsDefinition = new MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToOldProceedsDefinition";
			definition = "Securities procceds for which a nwe to old ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmNewToOld;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(QuantityRatio obj) {
			return obj.getNewToOldProceedsDefinition();
		}

		@Override
		public void setValue(QuantityRatio obj, SecuritiesProceedsDefinition value) {
			obj.setNewToOldProceedsDefinition(value);
		}
	};
	protected SecuritiesProceedsDefinition newToUnderlyingProceedsDefinition;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition> mmNewToUnderlyingProceedsDefinition = new MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewToUnderlyingProceedsDefinition";
			definition = "Securities proceeds for which a new to underlying ratio is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(QuantityRatio obj) {
			return obj.getNewToUnderlyingProceedsDefinition();
		}

		@Override
		public void setValue(QuantityRatio obj, SecuritiesProceedsDefinition value) {
			obj.setNewToUnderlyingProceedsDefinition(value);
		}
	};
	protected SecuritiesProceedsDefinition intermediateSecuritiesProceedsDefinition;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition> mmIntermediateSecuritiesProceedsDefinition = new MMBusinessAssociationEnd<QuantityRatio, SecuritiesProceedsDefinition>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which a quantity of intermediate securities is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
		}

		@Override
		public SecuritiesProceedsDefinition getValue(QuantityRatio obj) {
			return obj.getIntermediateSecuritiesProceedsDefinition();
		}

		@Override
		public void setValue(QuantityRatio obj, SecuritiesProceedsDefinition value) {
			obj.setIntermediateSecuritiesProceedsDefinition(value);
		}
	};
	protected Warrant warrant;
	/**
	 * 
	 <p>
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
	 * name} = "Warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the warrant for the related quantity or the underlying quantity. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<QuantityRatio, Warrant> mmWarrant = new MMBusinessAssociationEnd<QuantityRatio, Warrant>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.QuantityRatio.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Warrant";
			definition = "Provides the warrant for the related quantity or the underlying quantity. ";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Warrant.mmWarrantParity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Warrant.mmObject();
		}

		@Override
		public Warrant getValue(QuantityRatio obj) {
			return obj.getWarrant();
		}

		@Override
		public void setValue(QuantityRatio obj, Warrant value) {
			obj.setWarrant(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityRatio";
				definition = "Ratio expressed as a quotient of quantities.";
				associationDomain_lazy = () -> Arrays.asList(Warrant.mmWarrantParity, SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities,
						SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities, SecuritiesProceedsDefinition.mmNewToOld, SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities,
						SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmQuantity1,
						com.tools20022.repository.entity.QuantityRatio.mmQuantity2, com.tools20022.repository.entity.QuantityRatio.mmAdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmNewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmNewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.mmIntermediateSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.mmWarrant);
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

	public QuantityRatio setAdditionalQuantityForResultantSecuritiesProceedsDefinition(SecuritiesProceedsDefinition additionalQuantityForResultantSecuritiesProceedsDefinition) {
		this.additionalQuantityForResultantSecuritiesProceedsDefinition = Objects.requireNonNull(additionalQuantityForResultantSecuritiesProceedsDefinition);
		return this;
	}

	public DecimalNumber getQuantity1() {
		return quantity1;
	}

	public QuantityRatio setQuantity1(DecimalNumber quantity1) {
		this.quantity1 = Objects.requireNonNull(quantity1);
		return this;
	}

	public DecimalNumber getQuantity2() {
		return quantity2;
	}

	public QuantityRatio setQuantity2(DecimalNumber quantity2) {
		this.quantity2 = Objects.requireNonNull(quantity2);
		return this;
	}

	public SecuritiesProceedsDefinition getAdditionalQuantityForSubscribedSecuritiesProceedsDefinition() {
		return additionalQuantityForSubscribedSecuritiesProceedsDefinition;
	}

	public QuantityRatio setAdditionalQuantityForSubscribedSecuritiesProceedsDefinition(SecuritiesProceedsDefinition additionalQuantityForSubscribedSecuritiesProceedsDefinition) {
		this.additionalQuantityForSubscribedSecuritiesProceedsDefinition = Objects.requireNonNull(additionalQuantityForSubscribedSecuritiesProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getNewToOldProceedsDefinition() {
		return newToOldProceedsDefinition;
	}

	public QuantityRatio setNewToOldProceedsDefinition(SecuritiesProceedsDefinition newToOldProceedsDefinition) {
		this.newToOldProceedsDefinition = Objects.requireNonNull(newToOldProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getNewToUnderlyingProceedsDefinition() {
		return newToUnderlyingProceedsDefinition;
	}

	public QuantityRatio setNewToUnderlyingProceedsDefinition(SecuritiesProceedsDefinition newToUnderlyingProceedsDefinition) {
		this.newToUnderlyingProceedsDefinition = Objects.requireNonNull(newToUnderlyingProceedsDefinition);
		return this;
	}

	public SecuritiesProceedsDefinition getIntermediateSecuritiesProceedsDefinition() {
		return intermediateSecuritiesProceedsDefinition;
	}

	public QuantityRatio setIntermediateSecuritiesProceedsDefinition(SecuritiesProceedsDefinition intermediateSecuritiesProceedsDefinition) {
		this.intermediateSecuritiesProceedsDefinition = Objects.requireNonNull(intermediateSecuritiesProceedsDefinition);
		return this;
	}

	public Warrant getWarrant() {
		return warrant;
	}

	public QuantityRatio setWarrant(Warrant warrant) {
		this.warrant = Objects.requireNonNull(warrant);
		return this;
	}
}