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
import com.tools20022.repository.choice.BillingMethod1Choice;
import com.tools20022.repository.choice.TaxAmountType1Choice;
import com.tools20022.repository.choice.TaxExemptionReasonFormatChoice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tax" src="doc-files/Tax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
 * Tax.mmExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
 * Tax.mmTaxLiabilityValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
 * Tax.mmTaxRefundValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
 * Tax.mmSecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxRateType
 * Tax.mmTaxRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
 * Tax.mmTaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
 * Tax.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmIdentification
 * Tax.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
 * Tax.mmTaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmCertificateIdentification
 * Tax.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
 * Tax.mmAdministrationZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmMethod Tax.mmMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrency
 * Tax.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
 * Tax.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDeduction
 * Tax.mmTaxDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedCorporateActionDistribution
 * Tax.mmRelatedCorporateActionDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCalculationDate
 * Tax.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmDividend
 * Tax.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmWithholdingTaxType
 * Tax.mmWithholdingTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
 * Tax.mmCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxIdentificationType
 * Tax.mmTaxIdentificationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmTax Country.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmTax
 * Dividend.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
 * NetAssetValueCalculation.mmTaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
 * NetAssetValueCalculation.mmTaxRefund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmTax
 * CashAccount.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
 * SecuritiesTransfer.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
 * CorporateActionEvent.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
 * TaxPartyRole.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
 * TaxRecord.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
 * Distribution.mmDistributionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty3#mmTaxExemptionReason
 * TaxParty3.mmTaxExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmRate
 * BillingServicesTax1.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax2#mmRate
 * BillingServicesTax2.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#mmMethodA
 * BillingMethod1Choice.mmMethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#mmMethodB
 * BillingMethod1Choice.mmMethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#mmMethodD
 * BillingMethod1Choice.mmMethodD}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax3#mmRate
 * BillingServicesTax3.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod4#mmTaxCalculation
 * BillingMethod4.mmTaxCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmMethodC
 * BillingTaxRegion1.mmMethodC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice
 * TaxExemptionReasonFormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2 TaxCharges2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecordDetails1
 * TaxRecordDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1 TaxAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3
 * TaxInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxAmountType1Choice
 * TaxAmountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1
 * TaxAmountAndType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReason1 TaxReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod2 BillingMethod2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod3 BillingMethod3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BillingMethod1Choice
 * BillingMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1
 * TaxCalculation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4 BillingMethod4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1
 * BillingTaxRegion1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4
 * TaxInformation4}</li>
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
 * "Tax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxExemptReasonCode exemptionReason;
	/**
	 * Reason for a tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#mmUnstructured
	 * TaxExemptionReasonFormatChoice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#mmStructured
	 * TaxExemptionReasonFormatChoice.mmStructured}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExemptionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxExemptionReasonFormatChoice.mmUnstructured, TaxExemptionReasonFormatChoice.mmStructured);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getExemptionReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Country country;
	/**
	 * Place of taxation of an individual person or an organisation, where the
	 * tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#mmTax
	 * Country.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of taxation of an individual person or an organisation, where the tax is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected NetAssetValueCalculation taxLiabilityValueCalculation;
	/**
	 * Net asset value calculation for which tax liability information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
	 * NetAssetValueCalculation.mmTaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax liability information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxLiabilityValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected TaxTypeCode type;
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxTypeCode
	 * TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#mmCode
	 * TaxAmountType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#mmProprietary
	 * TaxAmountType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1#mmType
	 * TaxAmountAndType1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxAmountType1Choice.mmCode, TaxAmountType1Choice.mmProprietary, TaxAmountAndType1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money resulting from the calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#mmAmount
	 * TaxCharges2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecordDetails1#mmAmount
	 * TaxRecordDetails1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1#mmTotalAmount
	 * TaxAmount1.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmTotalTaxAmount
	 * TaxInformation3.mmTotalTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1#mmAmount
	 * TaxAmountAndType1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1#mmServiceChargeHostAmount
	 * BillingMethod1.mmServiceChargeHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2#mmServiceChargeHostAmount
	 * BillingMethod2.mmServiceChargeHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax3#mmTotalTaxAmount
	 * BillingServicesTax3.mmTotalTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTotalTax
	 * TaxCalculation1.mmTotalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmSettlementAmount
	 * BillingTaxRegion1.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmTaxDueToRegion
	 * BillingTaxRegion1.mmTaxDueToRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmTotalTaxAmount
	 * TaxInformation4.mmTotalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#mmTaxAmount
	 * RemittanceAmount3.mmTaxAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCharges2.mmAmount, TaxRecordDetails1.mmAmount, TaxAmount1.mmTotalAmount, TaxInformation3.mmTotalTaxAmount, TaxAmountAndType1.mmAmount, BillingMethod1.mmServiceChargeHostAmount,
					BillingMethod2.mmServiceChargeHostAmount, BillingServicesTax3.mmTotalTaxAmount, TaxCalculation1.mmTotalTax, BillingTaxRegion1.mmSettlementAmount, BillingTaxRegion1.mmTaxDueToRegion, TaxInformation4.mmTotalTaxAmount,
					RemittanceAmount3.mmTaxAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * Rate used for calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#mmRate
	 * TaxCharges2.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1#mmRate
	 * TaxAmount1.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCharges2.mmRate, TaxAmount1.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Party taxableParty;
	/**
	 * Party which is taxable at a specific location
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
	 * Party.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is taxable at a specific location"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxableParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmTaxationConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected NetAssetValueCalculation taxRefundValueCalculation;
	/**
	 * Net asset value calculation for which tax refund information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
	 * NetAssetValueCalculation.mmTaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax refund information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxRefundValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected TaxationBasisCode basis;
	/**
	 * Basis used to determine the capital gain or loss, eg, the purchase price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasis = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * Transfer process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected RateTypeCode taxRateType;
	/**
	 * Specifies the type of tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RateTypeCode
	 * RateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxRateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> taxAccount;
	/**
	 * Account to be used for taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmTax
	 * CashAccount.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to be used for taxes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Max350Text taxationConditions;
	/**
	 * Specifies other taxation conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies other taxation conditions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxationConditions = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxationConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Adjustment adjustment;
	/**
	 * Specifies the adjustments subject to a tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmTax
	 * Adjustment.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the adjustments subject to a tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected Interest interest;
	/**
	 * Interest for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Reference used to identify the nature of tax levied, such as Value Added
	 * Tax (VAT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCharges2#mmIdentification
	 * TaxCharges2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmReferenceNumber
	 * TaxInformation3.mmReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmReferenceNumber
	 * Garnishment1.mmReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmReferenceNumber
	 * TaxInformation4.mmReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCharges2.mmIdentification, TaxInformation3.mmReferenceNumber, Garnishment1.mmReferenceNumber, TaxInformation4.mmReferenceNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Payment relatedPaymentSettlement;
	/**
	 * Payment to which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment to which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmTaxOnPayment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected CurrencyAndAmount taxableBaseAmount;
	/**
	 * Amount of money on which the tax is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxAmount1#mmTaxableBaseAmount
	 * TaxAmount1.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmTotalTaxableBaseAmount
	 * TaxInformation3.mmTotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmTotalTaxableBaseAmount
	 * TaxInformation4.mmTotalTaxableBaseAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money on which the tax is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableBaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxAmount1.mmTaxableBaseAmount, TaxInformation3.mmTotalTaxableBaseAmount, TaxInformation4.mmTotalTaxableBaseAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxableBaseAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate taxDate;
	/**
	 * Date by which tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmDate
	 * TaxInformation3.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmPointDate
	 * BillingTaxRegion1.mmPointDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmDate
	 * TaxInformation4.mmDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxInformation3.mmDate, BillingTaxRegion1.mmPointDate, TaxInformation4.mmDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text certificateIdentification;
	/**
	 * Document issued by taxing authority identifying the tax payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord1#mmCertificateIdentification
	 * TaxRecord1.mmCertificateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document issued by taxing authority identifying the tax payer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxRecord1.mmCertificateIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getCertificateIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max140Text administrationZone;
	/**
	 * Territorial part of a country to which the tax payment is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmAdministrationZone
	 * TaxInformation3.mmAdministrationZone}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#mmRegion
	 * AccountTax1.mmRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#mmRegion
	 * ServiceTaxDesignation1.mmRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmRegionName
	 * BillingTaxRegion1.mmRegionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmAdministrationZone
	 * TaxInformation4.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmTaxRegion
	 * BillingStatement2.mmTaxRegion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Territorial part of a country to which the tax payment is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdministrationZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxInformation3.mmAdministrationZone, AccountTax1.mmRegion, ServiceTaxDesignation1.mmRegion, BillingTaxRegion1.mmRegionName, TaxInformation4.mmAdministrationZone,
					BillingStatement2.mmTaxRegion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getAdministrationZone", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text method;
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmMethod
	 * TaxInformation3.mmMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmMethod
	 * TaxInformation4.mmMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to indicate the underlying business or how the tax is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxInformation3.mmMethod, TaxInformation4.mmMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.TaxRecord> record;
	/**
	 * Record of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
	 * TaxRecord.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmRecord
	 * TaxInformation3.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1#mmTaxIdentification
	 * BillingMethod1.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2#mmTaxIdentification
	 * BillingMethod2.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3#mmTaxIdentification
	 * BillingMethod3.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTaxIdentification
	 * TaxCalculation1.mmTaxIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmRecord
	 * TaxInformation4.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxDesignation
	 * BillingService2.mmTaxDesignation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRecord = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TaxInformation3.mmRecord, BillingMethod1.mmTaxIdentification, BillingMethod2.mmTaxIdentification, BillingMethod3.mmTaxIdentification, TaxCalculation1.mmTaxIdentification,
					TaxInformation4.mmRecord, BillingService2.mmTaxDesignation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
		}
	};
	protected Product product;
	/**
	 * Product on which a tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#mmTax
	 * Product.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product on which a tax is applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Currency exchange applicable to a tax
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
	 * CurrencyExchange.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency in which the tax must be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmHostCurrency
	 * TaxCalculation1.mmHostCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmHostCurrencyCode
	 * CashAccountCharacteristics2.mmHostCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the tax must be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculation1.mmHostCurrency, CashAccountCharacteristics2.mmHostCurrencyCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.TaxPartyRole> partyRole;
	/**
	 * Specifies each role linked to a tax and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
	 * TaxPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmSendingFinancialInstitution
	 * BillingTaxRegion1.mmSendingFinancialInstitution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a tax and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BillingTaxRegion1.mmSendingFinancialInstitution);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmObject();
		}
	};
	protected CurrencyAndAmount taxDeduction;
	/**
	 * Amount of tax that have been previously deducted.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously deducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxDeduction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxDeduction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Distribution relatedCorporateActionDistribution;
	/**
	 * Distribution process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
	 * Distribution.mmDistributionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmDistributionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected ISODate calculationDate;
	/**
	 * Date on which the tax is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the tax is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getCalculationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * Dividend for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Dividend#mmTax
	 * Dividend.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected WithholdingTaxRateTypeCode withholdingTaxType;
	/**
	 * Type of withholding tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of withholding tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWithholdingTaxType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getWithholdingTaxType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Event for which a transaction tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
	 * CorporateActionEvent.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event for which a transaction tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected TaxIdentificationNumberTypeCode taxIdentificationType;
	/**
	 * Type of tax identification number or identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax identification number or identifier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxIdentificationType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tax.class.getMethod("getTaxIdentificationType", new Class[]{});
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
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmTax, com.tools20022.repository.entity.Dividend.mmTax, com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund, com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.CashAccount.mmTax,
						com.tools20022.repository.entity.Product.mmTax, com.tools20022.repository.entity.Adjustment.mmTax, com.tools20022.repository.entity.Payment.mmTaxOnPayment,
						com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax, com.tools20022.repository.entity.Interest.mmInterestTax, com.tools20022.repository.entity.CurrencyExchange.mmTax,
						com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax, com.tools20022.repository.entity.TaxPartyRole.mmTax, com.tools20022.repository.entity.TaxRecord.mmTax,
						com.tools20022.repository.entity.Distribution.mmDistributionTax);
				derivationElement_lazy = () -> Arrays.asList(TaxParty3.mmTaxExemptionReason, BillingServicesTax1.mmRate, BillingServicesTax2.mmRate, BillingMethod1Choice.mmMethodA, BillingMethod1Choice.mmMethodB,
						BillingMethod1Choice.mmMethodD, BillingServicesTax3.mmRate, BillingMethod4.mmTaxCalculation, BillingTaxRegion1.mmMethodC);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.mmExemptionReason, com.tools20022.repository.entity.Tax.mmCountry, com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.mmType, com.tools20022.repository.entity.Tax.mmAmount, com.tools20022.repository.entity.Tax.mmRate, com.tools20022.repository.entity.Tax.mmTaxableParty,
						com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation, com.tools20022.repository.entity.Tax.mmBasis, com.tools20022.repository.entity.Tax.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Tax.mmTaxRateType, com.tools20022.repository.entity.Tax.mmTaxAccount, com.tools20022.repository.entity.Tax.mmTaxationConditions, com.tools20022.repository.entity.Tax.mmAdjustment,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.Tax.mmIdentification, com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement,
						com.tools20022.repository.entity.Tax.mmTaxableBaseAmount, com.tools20022.repository.entity.Tax.mmTaxDate, com.tools20022.repository.entity.Tax.mmCertificateIdentification,
						com.tools20022.repository.entity.Tax.mmAdministrationZone, com.tools20022.repository.entity.Tax.mmMethod, com.tools20022.repository.entity.Tax.mmRecord, com.tools20022.repository.entity.Tax.mmProduct,
						com.tools20022.repository.entity.Tax.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrency, com.tools20022.repository.entity.Tax.mmPartyRole, com.tools20022.repository.entity.Tax.mmTaxDeduction,
						com.tools20022.repository.entity.Tax.mmRelatedCorporateActionDistribution, com.tools20022.repository.entity.Tax.mmCalculationDate, com.tools20022.repository.entity.Tax.mmDividend,
						com.tools20022.repository.entity.Tax.mmWithholdingTaxType, com.tools20022.repository.entity.Tax.mmCorporateActionEvent, com.tools20022.repository.entity.Tax.mmTaxIdentificationType);
				derivationComponent_lazy = () -> Arrays.asList(TaxExemptionReasonFormatChoice.mmObject(), TaxCharges2.mmObject(), TaxRecordDetails1.mmObject(), TaxAmount1.mmObject(), TaxInformation3.mmObject(),
						TaxAmountType1Choice.mmObject(), TaxAmountAndType1.mmObject(), AccountTax1.mmObject(), TaxReason1.mmObject(), BillingMethod1.mmObject(), BillingMethod2.mmObject(), BillingMethod3.mmObject(),
						BillingMethod1Choice.mmObject(), TaxCalculation1.mmObject(), BillingMethod4.mmObject(), BillingTaxRegion1.mmObject(), TaxInformation4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Tax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TaxExemptReasonCode getExemptionReason() {
		return exemptionReason;
	}

	public void setExemptionReason(TaxExemptReasonCode exemptionReason) {
		this.exemptionReason = exemptionReason;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public NetAssetValueCalculation getTaxLiabilityValueCalculation() {
		return taxLiabilityValueCalculation;
	}

	public void setTaxLiabilityValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation taxLiabilityValueCalculation) {
		this.taxLiabilityValueCalculation = taxLiabilityValueCalculation;
	}

	public TaxTypeCode getType() {
		return type;
	}

	public void setType(TaxTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public Party getTaxableParty() {
		return taxableParty;
	}

	public void setTaxableParty(com.tools20022.repository.entity.Party taxableParty) {
		this.taxableParty = taxableParty;
	}

	public NetAssetValueCalculation getTaxRefundValueCalculation() {
		return taxRefundValueCalculation;
	}

	public void setTaxRefundValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation taxRefundValueCalculation) {
		this.taxRefundValueCalculation = taxRefundValueCalculation;
	}

	public TaxationBasisCode getBasis() {
		return basis;
	}

	public void setBasis(TaxationBasisCode basis) {
		this.basis = basis;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public RateTypeCode getTaxRateType() {
		return taxRateType;
	}

	public void setTaxRateType(RateTypeCode taxRateType) {
		this.taxRateType = taxRateType;
	}

	public List<CashAccount> getTaxAccount() {
		return taxAccount;
	}

	public void setTaxAccount(List<com.tools20022.repository.entity.CashAccount> taxAccount) {
		this.taxAccount = taxAccount;
	}

	public Max350Text getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(Max350Text taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(com.tools20022.repository.entity.Adjustment adjustment) {
		this.adjustment = adjustment;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = interest;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Payment getRelatedPaymentSettlement() {
		return relatedPaymentSettlement;
	}

	public void setRelatedPaymentSettlement(com.tools20022.repository.entity.Payment relatedPaymentSettlement) {
		this.relatedPaymentSettlement = relatedPaymentSettlement;
	}

	public CurrencyAndAmount getTaxableBaseAmount() {
		return taxableBaseAmount;
	}

	public void setTaxableBaseAmount(CurrencyAndAmount taxableBaseAmount) {
		this.taxableBaseAmount = taxableBaseAmount;
	}

	public ISODate getTaxDate() {
		return taxDate;
	}

	public void setTaxDate(ISODate taxDate) {
		this.taxDate = taxDate;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public void setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
	}

	public Max140Text getAdministrationZone() {
		return administrationZone;
	}

	public void setAdministrationZone(Max140Text administrationZone) {
		this.administrationZone = administrationZone;
	}

	public Max35Text getMethod() {
		return method;
	}

	public void setMethod(Max35Text method) {
		this.method = method;
	}

	public List<TaxRecord> getRecord() {
		return record;
	}

	public void setRecord(List<com.tools20022.repository.entity.TaxRecord> record) {
		this.record = record;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(com.tools20022.repository.entity.Product product) {
		this.product = product;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public List<TaxPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.TaxPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public CurrencyAndAmount getTaxDeduction() {
		return taxDeduction;
	}

	public void setTaxDeduction(CurrencyAndAmount taxDeduction) {
		this.taxDeduction = taxDeduction;
	}

	public Distribution getRelatedCorporateActionDistribution() {
		return relatedCorporateActionDistribution;
	}

	public void setRelatedCorporateActionDistribution(com.tools20022.repository.entity.Distribution relatedCorporateActionDistribution) {
		this.relatedCorporateActionDistribution = relatedCorporateActionDistribution;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
	}

	public List<Dividend> getDividend() {
		return dividend;
	}

	public void setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = dividend;
	}

	public WithholdingTaxRateTypeCode getWithholdingTaxType() {
		return withholdingTaxType;
	}

	public void setWithholdingTaxType(WithholdingTaxRateTypeCode withholdingTaxType) {
		this.withholdingTaxType = withholdingTaxType;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public TaxIdentificationNumberTypeCode getTaxIdentificationType() {
		return taxIdentificationType;
	}

	public void setTaxIdentificationType(TaxIdentificationNumberTypeCode taxIdentificationType) {
		this.taxIdentificationType = taxIdentificationType;
	}
}