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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Processing characteristics linked to the instrument, ie, not to the market.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundClassProcessingCharacteristics"
 * src="doc-files/InvestmentFundClassProcessingCharacteristics.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmReinvestmentFrequency
 * InvestmentFundClassProcessingCharacteristics.mmReinvestmentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFrontEndLoadIndicator
 * InvestmentFundClassProcessingCharacteristics.mmFrontEndLoadIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmBackEndLoadIndicator
 * InvestmentFundClassProcessingCharacteristics.mmBackEndLoadIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSwitchingFeeIndicator
 * InvestmentFundClassProcessingCharacteristics.mmSwitchingFeeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLimitedSubscriptionPeriod
 * InvestmentFundClassProcessingCharacteristics.mmLimitedSubscriptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLimitedRedemptionPeriod
 * InvestmentFundClassProcessingCharacteristics.mmLimitedRedemptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDecimalisation
 * InvestmentFundClassProcessingCharacteristics.mmDecimalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmHoldingTransferableIndicator
 * InvestmentFundClassProcessingCharacteristics.mmHoldingTransferableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmApplicationForm
 * InvestmentFundClassProcessingCharacteristics.mmApplicationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSignatureRequired
 * InvestmentFundClassProcessingCharacteristics.mmSignatureRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmAmountIndicator
 * InvestmentFundClassProcessingCharacteristics.mmAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmUnitsIndicator
 * InvestmentFundClassProcessingCharacteristics.mmUnitsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmOrderCutOffDateTime
 * InvestmentFundClassProcessingCharacteristics.mmOrderCutOffDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementCycle
 * InvestmentFundClassProcessingCharacteristics.mmSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmFundClass
 * InvestmentFundClassProcessingCharacteristics.mmFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmHoldingTransferable
 * InvestmentFundClassProcessingCharacteristics.mmHoldingTransferable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingFrequency
 * InvestmentFundClassProcessingCharacteristics.mmDealingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLimitedPeriod
 * InvestmentFundClassProcessingCharacteristics.mmLimitedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSettlementAccount
 * InvestmentFundClassProcessingCharacteristics.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmCountry
 * InvestmentFundClassProcessingCharacteristics.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmLocalMarketAnnex
 * InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmEffectiveDate
 * InvestmentFundClassProcessingCharacteristics.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSubsequentSubscriptionApplicationForm
 * InvestmentFundClassProcessingCharacteristics.
 * mmSubsequentSubscriptionApplicationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmRedemptionForm
 * InvestmentFundClassProcessingCharacteristics.mmRedemptionForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCurrency
 * InvestmentFundClassProcessingCharacteristics.mmDealingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmDealingCutOffTimeFrame
 * InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingAmount
 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionUnits
 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingUnits
 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumRemainingHoldingAmount
 * InvestmentFundClassProcessingCharacteristics.mmMinimumRemainingHoldingAmount}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionPercentage
 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMaximumRedemptionAmount
 * InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionUnits
 * InvestmentFundClassProcessingCharacteristics.
 * mmMinimumInitialSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumSubscriptionAmount
 * InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumInitialSubscriptionAmount
 * InvestmentFundClassProcessingCharacteristics.
 * mmMinimumInitialSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumSubscriptionUnits
 * InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmMinimumHoldingPeriod
 * InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
 * InvestmentFundClass.mmProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryRelatedInvestmentFundProcessing
 * Country.mmCountryRelatedInvestmentFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
 * ContactPoint.mmInvestmentFundClassProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmSubscriptionSettlementRelatedFundProcessing
 * TimeFrame.mmSubscriptionSettlementRelatedFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRelatedProcessingCharacteristics
 * TimeFrame.mmRelatedProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedFundProcessingCharacteristics
 * Account.mmRelatedFundProcessingCharacteristics}</li>
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
 * "InvestmentFundClassProcessingCharacteristics"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processing characteristics linked to the instrument, ie, not to  the market."
 * </li>
 * </ul>
 */
public class InvestmentFundClassProcessingCharacteristics {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequencyCode reinvestmentFrequency;
	/**
	 * Frequency with which the reinvestment takes place, This is the same or
	 * less than the dividend frequency,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinvestmentFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentFrequency";
			definition = "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getReinvestmentFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator frontEndLoadIndicator;
	/**
	 * Front end charge on subscription orders for this class can be applied.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoadIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Front end charge on subscription orders for this class can be applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFrontEndLoadIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoadIndicator";
			definition = "Front end charge on subscription orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getFrontEndLoadIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator backEndLoadIndicator;
	/**
	 * Exit charge (eg. CDSC) on redemption orders for this class can be
	 * applied.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoadIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exit charge (eg. CDSC) on redemption orders for this class can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBackEndLoadIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndLoadIndicator";
			definition = "Exit charge (eg. CDSC) on redemption orders for this class can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getBackEndLoadIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator switchingFeeIndicator;
	/**
	 * If a separate fee for switching between sub-funds of the same umbrella
	 * can be applied.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchingFeeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a separate fee for switching between sub-funds of the same umbrella can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSwitchingFeeIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwitchingFeeIndicator";
			definition = "If a separate fee for switching between sub-funds of the same umbrella can be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getSwitchingFeeIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text limitedSubscriptionPeriod;
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be subscribed to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedSubscriptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLimitedSubscriptionPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitedSubscriptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getLimitedSubscriptionPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text limitedRedemptionPeriod;
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedRedemptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLimitedRedemptionPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitedRedemptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getLimitedRedemptionPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number decimalisation;
	/**
	 * Number of decimal places to which quantities of units/shares are rounded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of decimal places to which quantities of units/shares are rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDecimalisation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Decimalisation";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getDecimalisation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator holdingTransferableIndicator;
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingTransferableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether registered investors are able to transfer some or all of their holdings to third parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldingTransferableIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingTransferableIndicator";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getHoldingTransferableIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator applicationForm;
	/**
	 * Physical application form is required.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical application form is required."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmApplicationForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationForm";
			definition = "Physical application form is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getApplicationForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SignatureTypeCode signatureRequired;
	/**
	 * Specifies which type of signature is required when completing an initial
	 * subscription, when completing a subsequent subscription, and when
	 * completing redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode
	 * SignatureTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which type of signature is required when completing an initial subscription, when completing a subsequent subscription, and when completing redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSignatureRequired = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SignatureRequired";
			definition = "Specifies which type of signature is required when completing an initial subscription, when completing a subsequent subscription, and when completing redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SignatureTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getSignatureRequired", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator amountIndicator;
	/**
	 * Indicates whether subscriptions/redemption in amount are allowed.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether subscriptions/redemption in amount are allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmountIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountIndicator";
			definition = "Indicates whether subscriptions/redemption in amount are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getAmountIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator unitsIndicator;
	/**
	 * Indicates whether subsciptions/redemption may be placed as a number of
	 * units.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether subsciptions/redemption may be placed as a number of units."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitsIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitsIndicator";
			definition = "Indicates whether subsciptions/redemption may be placed as a number of units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getUnitsIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime orderCutOffDateTime;
	/**
	 * Last date/time at which an order to subscribe or an order to redeem can
	 * be given.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderCutOffDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which an order to subscribe or an order to redeem can be given."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOrderCutOffDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderCutOffDateTime";
			definition = "Last date/time at which an order to subscribe or an order to redeem can be given.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getOrderCutOffDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TimeFrame settlementCycle;
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period <br>
	 * Where T = the date the price is applied to a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmSubscriptionSettlementRelatedFundProcessing
	 * TimeFrame.mmSubscriptionSettlementRelatedFundProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \r\nWhere T = the date the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementCycle = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementCycle";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \r\nWhere T = the date the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmSubscriptionSettlementRelatedFundProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
		}
	};
	protected InvestmentFundClass fundClass;
	/**
	 * Investment fund class for which processing characteristics are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProcessingCharacteristics
	 * InvestmentFundClass.mmProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class for which processing characteristics are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundClass";
			definition = "Investment fund class for which processing characteristics are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmProcessingCharacteristics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected HoldingTransferableCode holdingTransferable;
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
	 * HoldingTransferableCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingTransferable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether registered investors are able to transfer some or all of their holdings to third parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHoldingTransferable = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingTransferable";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> HoldingTransferableCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getHoldingTransferable", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode dealingFrequency;
	/**
	 * Frequency at which the subscriptions and redemptions are done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency at which the subscriptions and redemptions are done."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealingFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealingFrequency";
			definition = "Frequency at which the subscriptions and redemptions are done.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getDealingFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text limitedPeriod;
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLimitedPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitedPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getLimitedPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Account> settlementAccount;
	/**
	 * Account used for settlement of fund transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedFundProcessingCharacteristics
	 * Account.mmRelatedFundProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for settlement of fund transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Account used for settlement of fund transactions.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmRelatedFundProcessingCharacteristics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected Country country;
	/**
	 * Country in which the processing characteristic applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCountryRelatedInvestmentFundProcessing
	 * Country.mmCountryRelatedInvestmentFundProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the processing characteristic applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which the processing characteristic applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCountryRelatedInvestmentFundProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> localMarketAnnex;
	/**
	 * Context, or geographic environment, in which trading parties may meet in
	 * order to negotiate and execute trades among themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmInvestmentFundClassProcessing
	 * ContactPoint.mmInvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarketAnnex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLocalMarketAnnex = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LocalMarketAnnex";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmInvestmentFundClassProcessing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected ISODateTime effectiveDate;
	/**
	 * Date/time as from which the processing characteristics are valid.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which the processing characteristics are valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time as from which the processing characteristics are valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator subsequentSubscriptionApplicationForm;
	/**
	 * Physical application form for subsequent investments by the same
	 * investor.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubsequentSubscriptionApplicationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical application form for subsequent investments by the same investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSubsequentSubscriptionApplicationForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubsequentSubscriptionApplicationForm";
			definition = "Physical application form for subsequent investments by the same investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getSubsequentSubscriptionApplicationForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator redemptionForm;
	/**
	 * Physical written instruction/renunciation form for redemption of
	 * units/shares by the investor.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical written instruction/renunciation form for redemption of units/shares by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRedemptionForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RedemptionForm";
			definition = "Physical written instruction/renunciation form for redemption of units/shares by the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getRedemptionForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode dealingCurrency;
	/**
	 * Currency in which a subscription or redemption is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which a subscription or redemption is accepted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDealingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealingCurrency";
			definition = "Currency in which a subscription or redemption is accepted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getDealingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TimeFrame dealingCutOffTimeFrame;
	/**
	 * Specifies the number of days for cut off before or after an activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRelatedProcessingCharacteristics
	 * TimeFrame.mmRelatedProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCutOffTimeFrame"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days for cut off before or after an activity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDealingCutOffTimeFrame = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DealingCutOffTimeFrame";
			definition = "Specifies the number of days for cut off before or after an activity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmRelatedProcessingCharacteristics;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TimeFrame.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumHoldingAmount;
	/**
	 * Minimum value of units that must be maintained to avoid automatic
	 * redemption.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum value of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumHoldingAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingAmount";
			definition = "Minimum value of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumHoldingAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber maximumRedemptionUnits;
	/**
	 * Maximum number of shares/units that may be redeemed on a single dealing
	 * day.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of shares/units that may be redeemed on a single dealing day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumRedemptionUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionUnits";
			definition = "Maximum number of shares/units that may be redeemed on a single dealing day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMaximumRedemptionUnits", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber minimumHoldingUnits;
	/**
	 * Minimum number of units that must be maintained to avoid automatic
	 * redemption.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumHoldingUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingUnits";
			definition = "Minimum number of units that must be maintained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumHoldingUnits", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount minimumRemainingHoldingAmount;
	/**
	 * Minimum value of units/shares that must be retained to avoid automatic
	 * redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRemainingHoldingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum value of units/shares that must be retained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumRemainingHoldingAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumRemainingHoldingAmount";
			definition = "Minimum value of units/shares that must be retained to avoid automatic redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumRemainingHoldingAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate maximumRedemptionPercentage;
	/**
	 * Maximum quantity of securities, expressed as a percentage that can be
	 * sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of securities, expressed as a percentage that can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumRedemptionPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionPercentage";
			definition = "Maximum quantity of securities, expressed as a percentage that can be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMaximumRedemptionPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount maximumRedemptionAmount;
	/**
	 * Maximum quantity of securities, expressed as an amount that can be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of securities, expressed as an amount that can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumRedemptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionAmount";
			definition = "Maximum quantity of securities, expressed as an amount that can be sold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMaximumRedemptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber minimumInitialSubscriptionUnits;
	/**
	 * Minimum initial number of units/shares that must be purchased.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial number of units/shares that must be purchased."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumInitialSubscriptionUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumInitialSubscriptionUnits";
			definition = "Minimum initial number of units/shares that must be purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumInitialSubscriptionUnits", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount minimumSubscriptionAmount;
	/**
	 * Minimum quantity of securities, expressed as an amount that must be
	 * purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as an amount that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumSubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSubscriptionAmount";
			definition = "Minimum quantity of securities, expressed as an amount that must be purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumSubscriptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount minimumInitialSubscriptionAmount;
	/**
	 * Minimum initial quantity of securities, expressed as an amount that must
	 * be purchased at subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumInitialSubscriptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumInitialSubscriptionAmount";
			definition = "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumInitialSubscriptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DecimalNumber minimumSubscriptionUnits;
	/**
	 * Minimum number of units/shares that must be purchase by existing
	 * investors.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of units/shares that must be purchase by existing investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumSubscriptionUnits = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSubscriptionUnits";
			definition = "Minimum number of units/shares that must be purchase by existing investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumSubscriptionUnits", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text minimumHoldingPeriod;
	/**
	 * Description of a period, that may be a number of days, weeks or
	 * descriptive period during which the units/shares must be held following
	 * their issue before redemption will be permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumHoldingPeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingPeriod";
			definition = "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFundClassProcessingCharacteristics.class.getMethod("getMinimumHoldingPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundClassProcessingCharacteristics";
				definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmProcessingCharacteristics, com.tools20022.repository.entity.Country.mmCountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.ContactPoint.mmInvestmentFundClassProcessing, com.tools20022.repository.entity.TimeFrame.mmSubscriptionSettlementRelatedFundProcessing,
						com.tools20022.repository.entity.TimeFrame.mmRelatedProcessingCharacteristics, com.tools20022.repository.entity.Account.mmRelatedFundProcessingCharacteristics);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmReinvestmentFrequency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFrontEndLoadIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmBackEndLoadIndicator,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSwitchingFeeIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLimitedSubscriptionPeriod,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLimitedRedemptionPeriod, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDecimalisation,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmHoldingTransferableIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmApplicationForm,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSignatureRequired, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmAmountIndicator,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmUnitsIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmOrderCutOffDateTime,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementCycle, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmFundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmHoldingTransferable, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDealingFrequency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLimitedPeriod, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSettlementAccount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmCountry, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmLocalMarketAnnex,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmEffectiveDate, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmSubsequentSubscriptionApplicationForm,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmRedemptionForm, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDealingCurrency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmDealingCutOffTimeFrame, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionUnits, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumRemainingHoldingAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionPercentage, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMaximumRedemptionAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumInitialSubscriptionAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumSubscriptionUnits, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.mmMinimumHoldingPeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFundClassProcessingCharacteristics.class;
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequencyCode getReinvestmentFrequency() {
		return reinvestmentFrequency;
	}

	public void setReinvestmentFrequency(EventFrequencyCode reinvestmentFrequency) {
		this.reinvestmentFrequency = reinvestmentFrequency;
	}

	public YesNoIndicator getFrontEndLoadIndicator() {
		return frontEndLoadIndicator;
	}

	public void setFrontEndLoadIndicator(YesNoIndicator frontEndLoadIndicator) {
		this.frontEndLoadIndicator = frontEndLoadIndicator;
	}

	public YesNoIndicator getBackEndLoadIndicator() {
		return backEndLoadIndicator;
	}

	public void setBackEndLoadIndicator(YesNoIndicator backEndLoadIndicator) {
		this.backEndLoadIndicator = backEndLoadIndicator;
	}

	public YesNoIndicator getSwitchingFeeIndicator() {
		return switchingFeeIndicator;
	}

	public void setSwitchingFeeIndicator(YesNoIndicator switchingFeeIndicator) {
		this.switchingFeeIndicator = switchingFeeIndicator;
	}

	public Max350Text getLimitedSubscriptionPeriod() {
		return limitedSubscriptionPeriod;
	}

	public void setLimitedSubscriptionPeriod(Max350Text limitedSubscriptionPeriod) {
		this.limitedSubscriptionPeriod = limitedSubscriptionPeriod;
	}

	public Max350Text getLimitedRedemptionPeriod() {
		return limitedRedemptionPeriod;
	}

	public void setLimitedRedemptionPeriod(Max350Text limitedRedemptionPeriod) {
		this.limitedRedemptionPeriod = limitedRedemptionPeriod;
	}

	public Number getDecimalisation() {
		return decimalisation;
	}

	public void setDecimalisation(Number decimalisation) {
		this.decimalisation = decimalisation;
	}

	public YesNoIndicator getHoldingTransferableIndicator() {
		return holdingTransferableIndicator;
	}

	public void setHoldingTransferableIndicator(YesNoIndicator holdingTransferableIndicator) {
		this.holdingTransferableIndicator = holdingTransferableIndicator;
	}

	public YesNoIndicator getApplicationForm() {
		return applicationForm;
	}

	public void setApplicationForm(YesNoIndicator applicationForm) {
		this.applicationForm = applicationForm;
	}

	public SignatureTypeCode getSignatureRequired() {
		return signatureRequired;
	}

	public void setSignatureRequired(SignatureTypeCode signatureRequired) {
		this.signatureRequired = signatureRequired;
	}

	public YesNoIndicator getAmountIndicator() {
		return amountIndicator;
	}

	public void setAmountIndicator(YesNoIndicator amountIndicator) {
		this.amountIndicator = amountIndicator;
	}

	public YesNoIndicator getUnitsIndicator() {
		return unitsIndicator;
	}

	public void setUnitsIndicator(YesNoIndicator unitsIndicator) {
		this.unitsIndicator = unitsIndicator;
	}

	public ISODateTime getOrderCutOffDateTime() {
		return orderCutOffDateTime;
	}

	public void setOrderCutOffDateTime(ISODateTime orderCutOffDateTime) {
		this.orderCutOffDateTime = orderCutOffDateTime;
	}

	public TimeFrame getSettlementCycle() {
		return settlementCycle;
	}

	public void setSettlementCycle(com.tools20022.repository.entity.TimeFrame settlementCycle) {
		this.settlementCycle = settlementCycle;
	}

	public InvestmentFundClass getFundClass() {
		return fundClass;
	}

	public void setFundClass(com.tools20022.repository.entity.InvestmentFundClass fundClass) {
		this.fundClass = fundClass;
	}

	public HoldingTransferableCode getHoldingTransferable() {
		return holdingTransferable;
	}

	public void setHoldingTransferable(HoldingTransferableCode holdingTransferable) {
		this.holdingTransferable = holdingTransferable;
	}

	public FrequencyCode getDealingFrequency() {
		return dealingFrequency;
	}

	public void setDealingFrequency(FrequencyCode dealingFrequency) {
		this.dealingFrequency = dealingFrequency;
	}

	public Max350Text getLimitedPeriod() {
		return limitedPeriod;
	}

	public void setLimitedPeriod(Max350Text limitedPeriod) {
		this.limitedPeriod = limitedPeriod;
	}

	public List<Account> getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(List<com.tools20022.repository.entity.Account> settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public List<ContactPoint> getLocalMarketAnnex() {
		return localMarketAnnex;
	}

	public void setLocalMarketAnnex(List<com.tools20022.repository.entity.ContactPoint> localMarketAnnex) {
		this.localMarketAnnex = localMarketAnnex;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public YesNoIndicator getSubsequentSubscriptionApplicationForm() {
		return subsequentSubscriptionApplicationForm;
	}

	public void setSubsequentSubscriptionApplicationForm(YesNoIndicator subsequentSubscriptionApplicationForm) {
		this.subsequentSubscriptionApplicationForm = subsequentSubscriptionApplicationForm;
	}

	public YesNoIndicator getRedemptionForm() {
		return redemptionForm;
	}

	public void setRedemptionForm(YesNoIndicator redemptionForm) {
		this.redemptionForm = redemptionForm;
	}

	public CurrencyCode getDealingCurrency() {
		return dealingCurrency;
	}

	public void setDealingCurrency(CurrencyCode dealingCurrency) {
		this.dealingCurrency = dealingCurrency;
	}

	public TimeFrame getDealingCutOffTimeFrame() {
		return dealingCutOffTimeFrame;
	}

	public void setDealingCutOffTimeFrame(com.tools20022.repository.entity.TimeFrame dealingCutOffTimeFrame) {
		this.dealingCutOffTimeFrame = dealingCutOffTimeFrame;
	}

	public ActiveCurrencyAndAmount getMinimumHoldingAmount() {
		return minimumHoldingAmount;
	}

	public void setMinimumHoldingAmount(ActiveCurrencyAndAmount minimumHoldingAmount) {
		this.minimumHoldingAmount = minimumHoldingAmount;
	}

	public DecimalNumber getMaximumRedemptionUnits() {
		return maximumRedemptionUnits;
	}

	public void setMaximumRedemptionUnits(DecimalNumber maximumRedemptionUnits) {
		this.maximumRedemptionUnits = maximumRedemptionUnits;
	}

	public DecimalNumber getMinimumHoldingUnits() {
		return minimumHoldingUnits;
	}

	public void setMinimumHoldingUnits(DecimalNumber minimumHoldingUnits) {
		this.minimumHoldingUnits = minimumHoldingUnits;
	}

	public CurrencyAndAmount getMinimumRemainingHoldingAmount() {
		return minimumRemainingHoldingAmount;
	}

	public void setMinimumRemainingHoldingAmount(CurrencyAndAmount minimumRemainingHoldingAmount) {
		this.minimumRemainingHoldingAmount = minimumRemainingHoldingAmount;
	}

	public PercentageRate getMaximumRedemptionPercentage() {
		return maximumRedemptionPercentage;
	}

	public void setMaximumRedemptionPercentage(PercentageRate maximumRedemptionPercentage) {
		this.maximumRedemptionPercentage = maximumRedemptionPercentage;
	}

	public CurrencyAndAmount getMaximumRedemptionAmount() {
		return maximumRedemptionAmount;
	}

	public void setMaximumRedemptionAmount(CurrencyAndAmount maximumRedemptionAmount) {
		this.maximumRedemptionAmount = maximumRedemptionAmount;
	}

	public DecimalNumber getMinimumInitialSubscriptionUnits() {
		return minimumInitialSubscriptionUnits;
	}

	public void setMinimumInitialSubscriptionUnits(DecimalNumber minimumInitialSubscriptionUnits) {
		this.minimumInitialSubscriptionUnits = minimumInitialSubscriptionUnits;
	}

	public CurrencyAndAmount getMinimumSubscriptionAmount() {
		return minimumSubscriptionAmount;
	}

	public void setMinimumSubscriptionAmount(CurrencyAndAmount minimumSubscriptionAmount) {
		this.minimumSubscriptionAmount = minimumSubscriptionAmount;
	}

	public CurrencyAndAmount getMinimumInitialSubscriptionAmount() {
		return minimumInitialSubscriptionAmount;
	}

	public void setMinimumInitialSubscriptionAmount(CurrencyAndAmount minimumInitialSubscriptionAmount) {
		this.minimumInitialSubscriptionAmount = minimumInitialSubscriptionAmount;
	}

	public DecimalNumber getMinimumSubscriptionUnits() {
		return minimumSubscriptionUnits;
	}

	public void setMinimumSubscriptionUnits(DecimalNumber minimumSubscriptionUnits) {
		this.minimumSubscriptionUnits = minimumSubscriptionUnits;
	}

	public Max70Text getMinimumHoldingPeriod() {
		return minimumHoldingPeriod;
	}

	public void setMinimumHoldingPeriod(Max70Text minimumHoldingPeriod) {
		this.minimumHoldingPeriod = minimumHoldingPeriod;
	}
}