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
import com.tools20022.repository.codeset.MarginProductCode;
import com.tools20022.repository.codeset.MarginTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the calculation and the resulting margin and independent amount
 * needed to cover the risk exposure of one party versus another.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MarginCall" src="doc-files/MarginCall.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarginCallValuationDate
 * MarginCall.MarginCallValuationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#AgreedAmount
 * MarginCall.AgreedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#VariationMargin
 * MarginCall.VariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#SegregatedIndependentAmount
 * MarginCall.SegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#DefaultFundContribution
 * MarginCall.DefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedVariationMarginType
 * MarginCall.ExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#ExpectedSegregatedIndependentAmountType
 * MarginCall.ExpectedSegregatedIndependentAmountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#TotalMarkToMarket
 * MarginCall.TotalMarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarkToMarketNetted
 * MarginCall.MarkToMarketNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarkToMarketGross
 * MarginCall.MarkToMarketGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#MarkToMarketFails
 * MarginCall.MarkToMarketFails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#FailsHaircut
 * MarginCall.FailsHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#InitialMargin
 * MarginCall.InitialMargin}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#IncreaseCoverage
 * MarginCall.IncreaseCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#CollateralisedMarginAccountIndicator
 * MarginCall.CollateralisedMarginAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#CollateralMovement
 * MarginCall.CollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#RelatedManagementProcess
 * MarginCall.RelatedManagementProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#Security
 * MarginCall.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#MarginProduct
 * MarginCall.MarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#MarginType
 * MarginCall.MarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#TotalMarginAmount
 * MarginCall.TotalMarginAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#RelatedMarginCall
 * Security.RelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#MarginCall
 * CollateralMovement.MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#MarginCall
 * CollateralManagement.MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#RelatedMarginCall
 * DefaultFundContribution.RelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#VariationMarginRelatedCall
 * ExpectedCollateralType.VariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#SegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.SegregatedIndependentAmountRelatedCall}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCall"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another."
 * </li>
 * </ul>
 */
public class MarginCall {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Close of business date that initiating party is valuing the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Close of business date that initiating party is valuing the margin call."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginCallValuationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallValuationDate";
			definition = "Close of business date that initiating party is valuing the margin call.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the amount which is undisputed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the amount which is undisputed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AgreedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmount";
			definition = "Specifies the amount which is undisputed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides the summation of the call amounts for the variation margin and
	 * optionally the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VariationMargin = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Provides the summation of the call amounts for the segregated independent
	 * amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the summation of the call amounts for the segregated independent amount only."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Portion of the participation to the default fund that clearing member
	 * must provide. It is the sum of the individual contributions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#RelatedMarginCall
	 * DefaultFundContribution.RelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution
	 * DefaultFundContribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundContribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the expected collateral type and direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#VariationMarginRelatedCall
	 * ExpectedCollateralType.VariationMarginRelatedCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedVariationMarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expected collateral type and direction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExpectedVariationMarginType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedVariationMarginType";
			definition = "Specifies the expected collateral type and direction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ExpectedCollateralType.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the expected collateral type and direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#SegregatedIndependentAmountRelatedCall
	 * ExpectedCollateralType.SegregatedIndependentAmountRelatedCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
	 * ExpectedCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedSegregatedIndependentAmountType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the expected collateral type and direction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ExpectedSegregatedIndependentAmountType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSegregatedIndependentAmountType";
			definition = "Specifies the expected collateral type and direction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ExpectedCollateralType.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net unrealised profit or loss on the value of the netted, gross and
	 * failing positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarkToMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net unrealised profit or loss on the value of the netted, gross and failing positions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalMarkToMarket = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unrealised net loss calculated at the participant portfolio level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketNetted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrealised net loss calculated at the participant portfolio level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarkToMarketNetted = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unrealised net loss calculated in that market/boundary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketGross"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrealised net loss calculated in that market/boundary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarkToMarketGross = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sum of the unrealised loss without taking profit into consideration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkToMarketFails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the unrealised loss without taking profit into consideration."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarkToMarketFails = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Haircut applied to the absolute value of the participants net positions.
	 * Calculation depends on a participants credit rating.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailsHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FailsHaircut = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Margin required for absorbing future market price fluctuations (market
	 * risks) occurring between the default of a member and close-out of
	 * unsettled securities positions by the CCP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InitialMargin = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount added to the requirement amount. Its value is at the discretion of
	 * the central clearing counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IncreaseCoverage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverage";
			definition = "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Used to indicate whether the reported margin account is collateralised or
	 * not. If not collateralised, the account is configured for informational
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisedMarginAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralisedMarginAccountIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Movements resulting from the margin call calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#MarginCall
	 * CollateralMovement.MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Movements resulting from the margin call calculation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Movements resulting from the margin call calculation.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.MarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#MarginCall
	 * CollateralManagement.MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.MarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of the securities related to the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#RelatedMarginCall
	 * Security.RelatedMarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the securities related to the margin call."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Description of the securities related to the margin call.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.RelatedMarginCall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the underlying product of the margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarginProductCode
	 * MarginProductCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product of the margin."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginProduct = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginProduct";
			definition = "Specifies the underlying product of the margin.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarginProductCode.mmObject();
		}
	};
	/**
	 * Specifies the type of margin, for example, initial margin, variation
	 * margin, initial deposit or coupon margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarginTypeCode
	 * MarginTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarginType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginType";
			definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarginTypeCode.mmObject();
		}
	};
	/**
	 * Total margin requirement (expressed in the reporting currency) that must
	 * be provided. This is the total requirement calculated to cover the
	 * initial margin and the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalMarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MarginCall.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginCall";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.RelatedMarginCall, com.tools20022.repository.entity.CollateralMovement.MarginCall,
						com.tools20022.repository.entity.CollateralManagement.MarginCall, com.tools20022.repository.entity.DefaultFundContribution.RelatedMarginCall,
						com.tools20022.repository.entity.ExpectedCollateralType.VariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.SegregatedIndependentAmountRelatedCall);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.MarginCallValuationDate, com.tools20022.repository.entity.MarginCall.AgreedAmount, com.tools20022.repository.entity.MarginCall.VariationMargin,
						com.tools20022.repository.entity.MarginCall.SegregatedIndependentAmount, com.tools20022.repository.entity.MarginCall.DefaultFundContribution, com.tools20022.repository.entity.MarginCall.ExpectedVariationMarginType,
						com.tools20022.repository.entity.MarginCall.ExpectedSegregatedIndependentAmountType, com.tools20022.repository.entity.MarginCall.TotalMarkToMarket, com.tools20022.repository.entity.MarginCall.MarkToMarketNetted,
						com.tools20022.repository.entity.MarginCall.MarkToMarketGross, com.tools20022.repository.entity.MarginCall.MarkToMarketFails, com.tools20022.repository.entity.MarginCall.FailsHaircut,
						com.tools20022.repository.entity.MarginCall.InitialMargin, com.tools20022.repository.entity.MarginCall.IncreaseCoverage, com.tools20022.repository.entity.MarginCall.CollateralisedMarginAccountIndicator,
						com.tools20022.repository.entity.MarginCall.CollateralMovement, com.tools20022.repository.entity.MarginCall.RelatedManagementProcess, com.tools20022.repository.entity.MarginCall.Security,
						com.tools20022.repository.entity.MarginCall.MarginProduct, com.tools20022.repository.entity.MarginCall.MarginType, com.tools20022.repository.entity.MarginCall.TotalMarginAmount);
			}
		});
		return mmObject_lazy.get();
	}
}