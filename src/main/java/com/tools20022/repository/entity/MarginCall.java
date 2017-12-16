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
import com.tools20022.repository.codeset.MarginProductCode;
import com.tools20022.repository.codeset.MarginTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarginCallValuationDate
 * MarginCall.mmMarginCallValuationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmAgreedAmount
 * MarginCall.mmAgreedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
 * MarginCall.mmVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmSegregatedIndependentAmount
 * MarginCall.mmSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmDefaultFundContribution
 * MarginCall.mmDefaultFundContribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedVariationMarginType
 * MarginCall.mmExpectedVariationMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmExpectedSegregatedIndependentAmountType
 * MarginCall.mmExpectedSegregatedIndependentAmountType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarkToMarket
 * MarginCall.mmTotalMarkToMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketNetted
 * MarginCall.mmMarkToMarketNetted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketGross
 * MarginCall.mmMarkToMarketGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmMarkToMarketFails
 * MarginCall.mmMarkToMarketFails}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmFailsHaircut
 * MarginCall.mmFailsHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
 * MarginCall.mmInitialMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmIncreaseCoverage
 * MarginCall.mmIncreaseCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralisedMarginAccountIndicator
 * MarginCall.mmCollateralisedMarginAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
 * MarginCall.mmCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmRelatedManagementProcess
 * MarginCall.mmRelatedManagementProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmSecurity
 * MarginCall.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmMarginProduct
 * MarginCall.mmMarginProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MarginCall#mmMarginType
 * MarginCall.mmMarginType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarginAmount
 * MarginCall.mmTotalMarginAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
 * Security.mmRelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmMarginCall
 * CollateralMovement.mmMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmMarginCall
 * CollateralManagement.mmMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmRelatedMarginCall
 * DefaultFundContribution.mmRelatedMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmVariationMarginRelatedCall
 * ExpectedCollateralType.mmVariationMarginRelatedCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmSegregatedIndependentAmountRelatedCall
 * ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall}</li>
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
	protected ISODateTime marginCallValuationDate;
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
	public static final MMBusinessAttribute mmMarginCallValuationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallValuationDate";
			definition = "Close of business date that initiating party is valuing the margin call.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getMarginCallValuationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount agreedAmount;
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
	public static final MMBusinessAttribute mmAgreedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedAmount";
			definition = "Specifies the amount which is undisputed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getAgreedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount variationMargin;
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
	public static final MMBusinessAttribute mmVariationMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides the summation of the call amounts for the variation margin and optionally the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getVariationMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount segregatedIndependentAmount;
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
	public static final MMBusinessAttribute mmSegregatedIndependentAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the summation of the call amounts for the segregated independent amount only.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getSegregatedIndependentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DefaultFundContribution defaultFundContribution;
	/**
	 * Portion of the participation to the default fund that clearing member
	 * must provide. It is the sum of the individual contributions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DefaultFundContribution#mmRelatedMarginCall
	 * DefaultFundContribution.mmRelatedMarginCall}</li>
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
	public static final MMBusinessAssociationEnd mmDefaultFundContribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundContribution";
			definition = "Portion of the participation to the default fund that clearing member must provide. It is the sum of the individual contributions.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmRelatedMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DefaultFundContribution.mmObject();
		}
	};
	protected ExpectedCollateralType expectedVariationMarginType;
	/**
	 * Specifies the expected collateral type and direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmVariationMarginRelatedCall
	 * ExpectedCollateralType.mmVariationMarginRelatedCall}</li>
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
	public static final MMBusinessAssociationEnd mmExpectedVariationMarginType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedVariationMarginType";
			definition = "Specifies the expected collateral type and direction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmVariationMarginRelatedCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
		}
	};
	protected ExpectedCollateralType expectedSegregatedIndependentAmountType;
	/**
	 * Specifies the expected collateral type and direction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmSegregatedIndependentAmountRelatedCall
	 * ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall}</li>
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
	public static final MMBusinessAssociationEnd mmExpectedSegregatedIndependentAmountType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedSegregatedIndependentAmountType";
			definition = "Specifies the expected collateral type and direction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExpectedCollateralType.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalMarkToMarket;
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
	public static final MMBusinessAttribute mmTotalMarkToMarket = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarkToMarket";
			definition = "Net unrealised profit or loss on the value of the netted, gross and failing positions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getTotalMarkToMarket", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount markToMarketNetted;
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
	public static final MMBusinessAttribute mmMarkToMarketNetted = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketNetted";
			definition = "Unrealised net loss calculated at the participant portfolio level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getMarkToMarketNetted", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount markToMarketGross;
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
	public static final MMBusinessAttribute mmMarkToMarketGross = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketGross";
			definition = "Unrealised net loss calculated in that market/boundary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getMarkToMarketGross", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount markToMarketFails;
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
	public static final MMBusinessAttribute mmMarkToMarketFails = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkToMarketFails";
			definition = "Sum of the unrealised loss without taking profit into consideration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getMarkToMarketFails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount failsHaircut;
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
	public static final MMBusinessAttribute mmFailsHaircut = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailsHaircut";
			definition = "Haircut applied to the absolute value of the participants net positions. Calculation depends on a participants credit rating.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getFailsHaircut", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount initialMargin;
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
	public static final MMBusinessAttribute mmInitialMargin = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the CCP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getInitialMargin", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount increaseCoverage;
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
	public static final MMBusinessAttribute mmIncreaseCoverage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverage";
			definition = "Amount added to the requirement amount. Its value is at the discretion of the central clearing counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getIncreaseCoverage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator collateralisedMarginAccountIndicator;
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
	public static final MMBusinessAttribute mmCollateralisedMarginAccountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisedMarginAccountIndicator";
			definition = "Used to indicate whether the reported margin account is collateralised or not. If not collateralised, the account is configured for informational reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getCollateralisedMarginAccountIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CollateralMovement> collateralMovement;
	/**
	 * Movements resulting from the margin call calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmMarginCall
	 * CollateralMovement.mmMarginCall}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralMovement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Movements resulting from the margin call calculation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmMarginCall
	 * CollateralManagement.mmMarginCall}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Description of the securities related to the margin call.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRelatedMarginCall
	 * Security.mmRelatedMarginCall}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Description of the securities related to the margin call.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmRelatedMarginCall;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected MarginProductCode marginProduct;
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
	public static final MMBusinessAttribute mmMarginProduct = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginProduct";
			definition = "Specifies the underlying product of the margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginProductCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getMarginProduct", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarginTypeCode marginType;
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
	public static final MMBusinessAttribute mmMarginType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginType";
			definition = "Specifies the type of margin, for example, initial margin, variation margin, initial deposit or coupon margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarginTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getMarginType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount totalMarginAmount;
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
	public static final MMBusinessAttribute mmTotalMarginAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided. This is the total requirement calculated to cover the initial margin and the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MarginCall.class.getMethod("getTotalMarginAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MarginCall";
				definition = "Specifies the calculation and the resulting margin and independent amount needed to cover the risk exposure of one party versus another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmRelatedMarginCall, com.tools20022.repository.entity.CollateralMovement.mmMarginCall,
						com.tools20022.repository.entity.CollateralManagement.mmMarginCall, com.tools20022.repository.entity.DefaultFundContribution.mmRelatedMarginCall,
						com.tools20022.repository.entity.ExpectedCollateralType.mmVariationMarginRelatedCall, com.tools20022.repository.entity.ExpectedCollateralType.mmSegregatedIndependentAmountRelatedCall);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MarginCall.mmMarginCallValuationDate, com.tools20022.repository.entity.MarginCall.mmAgreedAmount,
						com.tools20022.repository.entity.MarginCall.mmVariationMargin, com.tools20022.repository.entity.MarginCall.mmSegregatedIndependentAmount, com.tools20022.repository.entity.MarginCall.mmDefaultFundContribution,
						com.tools20022.repository.entity.MarginCall.mmExpectedVariationMarginType, com.tools20022.repository.entity.MarginCall.mmExpectedSegregatedIndependentAmountType,
						com.tools20022.repository.entity.MarginCall.mmTotalMarkToMarket, com.tools20022.repository.entity.MarginCall.mmMarkToMarketNetted, com.tools20022.repository.entity.MarginCall.mmMarkToMarketGross,
						com.tools20022.repository.entity.MarginCall.mmMarkToMarketFails, com.tools20022.repository.entity.MarginCall.mmFailsHaircut, com.tools20022.repository.entity.MarginCall.mmInitialMargin,
						com.tools20022.repository.entity.MarginCall.mmIncreaseCoverage, com.tools20022.repository.entity.MarginCall.mmCollateralisedMarginAccountIndicator, com.tools20022.repository.entity.MarginCall.mmCollateralMovement,
						com.tools20022.repository.entity.MarginCall.mmRelatedManagementProcess, com.tools20022.repository.entity.MarginCall.mmSecurity, com.tools20022.repository.entity.MarginCall.mmMarginProduct,
						com.tools20022.repository.entity.MarginCall.mmMarginType, com.tools20022.repository.entity.MarginCall.mmTotalMarginAmount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MarginCall.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getMarginCallValuationDate() {
		return marginCallValuationDate;
	}

	public void setMarginCallValuationDate(ISODateTime marginCallValuationDate) {
		this.marginCallValuationDate = marginCallValuationDate;
	}

	public ActiveCurrencyAndAmount getAgreedAmount() {
		return agreedAmount;
	}

	public void setAgreedAmount(ActiveCurrencyAndAmount agreedAmount) {
		this.agreedAmount = agreedAmount;
	}

	public ActiveCurrencyAndAmount getVariationMargin() {
		return variationMargin;
	}

	public void setVariationMargin(ActiveCurrencyAndAmount variationMargin) {
		this.variationMargin = variationMargin;
	}

	public ActiveCurrencyAndAmount getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(ActiveCurrencyAndAmount segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}

	public DefaultFundContribution getDefaultFundContribution() {
		return defaultFundContribution;
	}

	public void setDefaultFundContribution(com.tools20022.repository.entity.DefaultFundContribution defaultFundContribution) {
		this.defaultFundContribution = defaultFundContribution;
	}

	public ExpectedCollateralType getExpectedVariationMarginType() {
		return expectedVariationMarginType;
	}

	public void setExpectedVariationMarginType(com.tools20022.repository.entity.ExpectedCollateralType expectedVariationMarginType) {
		this.expectedVariationMarginType = expectedVariationMarginType;
	}

	public ExpectedCollateralType getExpectedSegregatedIndependentAmountType() {
		return expectedSegregatedIndependentAmountType;
	}

	public void setExpectedSegregatedIndependentAmountType(com.tools20022.repository.entity.ExpectedCollateralType expectedSegregatedIndependentAmountType) {
		this.expectedSegregatedIndependentAmountType = expectedSegregatedIndependentAmountType;
	}

	public ActiveCurrencyAndAmount getTotalMarkToMarket() {
		return totalMarkToMarket;
	}

	public void setTotalMarkToMarket(ActiveCurrencyAndAmount totalMarkToMarket) {
		this.totalMarkToMarket = totalMarkToMarket;
	}

	public ActiveCurrencyAndAmount getMarkToMarketNetted() {
		return markToMarketNetted;
	}

	public void setMarkToMarketNetted(ActiveCurrencyAndAmount markToMarketNetted) {
		this.markToMarketNetted = markToMarketNetted;
	}

	public ActiveCurrencyAndAmount getMarkToMarketGross() {
		return markToMarketGross;
	}

	public void setMarkToMarketGross(ActiveCurrencyAndAmount markToMarketGross) {
		this.markToMarketGross = markToMarketGross;
	}

	public ActiveCurrencyAndAmount getMarkToMarketFails() {
		return markToMarketFails;
	}

	public void setMarkToMarketFails(ActiveCurrencyAndAmount markToMarketFails) {
		this.markToMarketFails = markToMarketFails;
	}

	public ActiveCurrencyAndAmount getFailsHaircut() {
		return failsHaircut;
	}

	public void setFailsHaircut(ActiveCurrencyAndAmount failsHaircut) {
		this.failsHaircut = failsHaircut;
	}

	public ActiveCurrencyAndAmount getInitialMargin() {
		return initialMargin;
	}

	public void setInitialMargin(ActiveCurrencyAndAmount initialMargin) {
		this.initialMargin = initialMargin;
	}

	public ActiveCurrencyAndAmount getIncreaseCoverage() {
		return increaseCoverage;
	}

	public void setIncreaseCoverage(ActiveCurrencyAndAmount increaseCoverage) {
		this.increaseCoverage = increaseCoverage;
	}

	public YesNoIndicator getCollateralisedMarginAccountIndicator() {
		return collateralisedMarginAccountIndicator;
	}

	public void setCollateralisedMarginAccountIndicator(YesNoIndicator collateralisedMarginAccountIndicator) {
		this.collateralisedMarginAccountIndicator = collateralisedMarginAccountIndicator;
	}

	public List<CollateralMovement> getCollateralMovement() {
		return collateralMovement;
	}

	public void setCollateralMovement(List<com.tools20022.repository.entity.CollateralMovement> collateralMovement) {
		this.collateralMovement = collateralMovement;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return relatedManagementProcess;
	}

	public void setRelatedManagementProcess(com.tools20022.repository.entity.CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public MarginProductCode getMarginProduct() {
		return marginProduct;
	}

	public void setMarginProduct(MarginProductCode marginProduct) {
		this.marginProduct = marginProduct;
	}

	public MarginTypeCode getMarginType() {
		return marginType;
	}

	public void setMarginType(MarginTypeCode marginType) {
		this.marginType = marginType;
	}

	public ActiveCurrencyAndAmount getTotalMarginAmount() {
		return totalMarginAmount;
	}

	public void setTotalMarginAmount(ActiveCurrencyAndAmount totalMarginAmount) {
		this.totalMarginAmount = totalMarginAmount;
	}
}