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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conversion exchange of securities, generally convertible bonds or preferred
 * equities, into another form of securities, usually common equities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesConversion" src="doc-files/SecuritiesConversion.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPrice
 * SecuritiesConversion.ConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionDate
 * SecuritiesConversion.ConversionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableQuantity
 * SecuritiesConversion.MinimumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumExercisableMultipleQuantity
 * SecuritiesConversion.MinimumExercisableMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MaximumExercisableQuantity
 * SecuritiesConversion.MaximumExercisableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionType
 * SecuritiesConversion.ConversionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionPeriod
 * SecuritiesConversion.ConversionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioDenominator
 * SecuritiesConversion.ConversionRatioDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionRatioNumerator
 * SecuritiesConversion.ConversionRatioNumerator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesConversion#Ratio
 * SecuritiesConversion.Ratio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionUnitCurrency
 * SecuritiesConversion.ConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#RelatedOption
 * SecuritiesConversion.RelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#BusinessDayConvention
 * SecuritiesConversion.BusinessDayConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionChoice
 * SecuritiesConversion.ConversionChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionFixedExchangeRate
 * SecuritiesConversion.ConversionFixedExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionMarginAmount
 * SecuritiesConversion.ConversionMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionOption
 * SecuritiesConversion.ConversionOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionQuotedCurrency
 * SecuritiesConversion.ConversionQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#FinancialCenter
 * SecuritiesConversion.FinancialCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#MinimumNoticeDays
 * SecuritiesConversion.MinimumNoticeDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#NoticePeriodType
 * SecuritiesConversion.NoticePeriodType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ProtectionAgainstDilutionIndicator
 * SecuritiesConversion.ProtectionAgainstDilutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ReverseConversionIndicator
 * SecuritiesConversion.ReverseConversionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#SecurityIdentification
 * SecuritiesConversion.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#PartyType
 * SecuritiesConversion.PartyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ContractSize
 * SecuritiesConversion.ContractSize}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Conversion
 * Security.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesConversion
 * SecuritiesPricing.RelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SecuritiesConversion
 * DateTimePeriod.SecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableMultipleQuantitySecuritiesConversion
 * SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantitySecuritiesConversion
 * SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioDenominatorSecuritiesConversion
 * SecuritiesQuantity.RatioDenominatorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioNumeratorSecuritiesConversion
 * SecuritiesQuantity.RatioNumeratorSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.CurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#OptionConversionInformation
 * Option.OptionConversionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#SecuritiesConversion
 * UnderlyingRatio.SecuritiesConversion}</li>
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
 * "SecuritiesConversion"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities."
 * </li>
 * </ul>
 */
public class SecuritiesConversion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price of one target security in the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedSecuritiesConversion
	 * SecuritiesPricing.RelatedSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price of one target security in the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionPrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionPrice";
			definition = "Price of one target security in the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Deadline by which a convertible security must be converted according to
	 * the terms of the issue.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deadline by which a convertible security must be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionDate";
			definition = "Deadline by which a convertible security must be converted according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Minimum quantity of financial instrument or lot of rights/warrants that
	 * must be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableQuantity";
			definition = "Minimum quantity of financial instrument or lot of rights/warrants that must be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum multiple quantity of financial instrument or lot of
	 * rights/warrants that must be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumExercisableMultipleQuantitySecuritiesConversion
	 * SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumExercisableMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumExercisableMultipleQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumExercisableMultipleQuantity";
			definition = "Minimum multiple quantity of financial instrument or lot of rights/warrants that must be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the maximum quantity of financial instrument that may be
	 * exercised in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumExercisableQuantitySecuritiesConversion
	 * SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumExercisableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum quantity of financial instrument that may be exercised in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumExercisableQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumExercisableQuantity";
			definition = "Indicates the maximum quantity of financial instrument that may be exercised in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the conversion type of an instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConversionTypeCode
	 * ConversionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the conversion type of an instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionType";
			definition = "Specifies the conversion type of an instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConversionTypeCode.mmObject();
		}
	};
	/**
	 * Period during which a convertible security may be converted according to
	 * the terms of the issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#SecuritiesConversion
	 * DateTimePeriod.SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which a convertible security may be converted according to the terms of the issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionPeriod";
			definition = "Period during which a convertible security may be converted according to the terms of the issue.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of held securities for the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioDenominatorSecuritiesConversion
	 * SecuritiesQuantity.RatioDenominatorSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionRatioDenominator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioDenominator";
			definition = "Number of held securities for the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Number of target securities for the conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RatioNumeratorSecuritiesConversion
	 * SecuritiesQuantity.RatioNumeratorSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionRatioNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of target securities for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionRatioNumerator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionRatioNumerator";
			definition = "Number of target securities for the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Ratio applied to convert the related security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#SecuritiesConversion
	 * UnderlyingRatio.SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
	 * UnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ratio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied to convert the related security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Ratio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Ratio";
			definition = "Ratio applied to convert the related security.";
			minOccurs = 0;
			type_lazy = () -> UnderlyingRatio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesConversion
	 * CurrencyExchange.CurrencyExchangeForSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionUnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ConversionUnitCurrency = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionUnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Option for which securities conversion information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#OptionConversionInformation
	 * Option.OptionConversionInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option for which securities conversion information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOption";
			definition = "Option for which securities conversion information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Option.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Option.OptionConversionInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Convention used for adjusting a date when it is not a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Convention used for adjusting a date when it is not a business day."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BusinessDayConvention = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BusinessDayConvention";
			definition = "Convention used for adjusting a date when it is not a business day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BusinessDayConventionCode.mmObject();
		}
	};
	/**
	 * Specifies whether the conversion is mandatory or optional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ChoiceCode
	 * ChoiceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the conversion is mandatory or optional."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionChoice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionChoice";
			definition = "Specifies whether the conversion is mandatory or optional.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ChoiceCode.mmObject();
		}
	};
	/**
	 * Currency exchange rate between the bond currency and the underlying
	 * equity currency used to calculate the convertion ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionFixedExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionFixedExchangeRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionFixedExchangeRate";
			definition = "Currency exchange rate between the bond currency and the underlying equity currency used to calculate the convertion ratio.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of cash needed for the conversion.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash needed for the conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionMarginAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionMarginAmount";
			definition = "Amount of cash needed for the conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies information about the choices offered to the holder of a
	 * conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionOptionCode
	 * CorporateActionOptionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the choices offered to the holder of a conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionOption = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionOption";
			definition = "Specifies information about the choices offered to the holder of a conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionOptionCode.mmObject();
		}
	};
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
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
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#SettlementCurrency
	 * LoanContract1.SettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionQuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ConversionQuotedCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.SettlementCurrency);
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ConversionQuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Financial place taken into account to adjust the date and time, as
	 * defined within the business day convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial place  taken into account to adjust the date and time, as defined within the business day convention."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialCenter = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCenter";
			definition = "Financial place  taken into account to adjust the date and time, as defined within the business day convention.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialCenterCode.mmObject();
		}
	};
	/**
	 * Minimum number of days that must be given by either the issuer or the
	 * holder before conversion can take place.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumNoticeDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days that must be given by either the issuer or the holder before conversion can take place."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumNoticeDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumNoticeDays";
			definition = "Minimum number of days that must be given by either the issuer or the holder before conversion can take place.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the type of notice period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NoticePeriodTypeCode
	 * NoticePeriodTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoticePeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of notice period."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NoticePeriodType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NoticePeriodType";
			definition = "Specifies the type of notice period.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> NoticePeriodTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the security is protected against dilution with regards
	 * to capital events.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectionAgainstDilutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the security is protected against dilution with regards to capital events."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProtectionAgainstDilutionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectionAgainstDilutionIndicator";
			definition = "Indicates whether the security is protected against dilution with regards to capital events.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the bond is convertible into an equity and back to the
	 * bond.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseConversionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the bond is convertible into an equity and back to the bond."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReverseConversionIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReverseConversionIndicator";
			definition = "Indicates whether the bond is convertible into an equity and back to the bond.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * ISIN identification of the related financial instrument into which this
	 * security can be converted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Conversion
	 * Security.Conversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISIN identification of the related financial instrument into which this security can be converted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecurityIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "ISIN identification of the related financial instrument into which this security can be converted.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Conversion;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies if the issuer or the holder are allowed to convert the security
	 * into another one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartyTypeCode
	 * PartyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer or the holder are allowed to convert the security into another one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartyType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyType";
			definition = "Specifies if the issuer or the holder are allowed to convert the security into another one.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PartyTypeCode.mmObject();
		}
	};
	/**
	 * Ratio or multiplying factor used to convert one contract into a quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ContractSize = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesConversion.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesConversion";
				definition = "Conversion exchange of securities, generally convertible bonds or preferred equities, into another form of securities, usually common equities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Conversion, com.tools20022.repository.entity.SecuritiesPricing.RelatedSecuritiesConversion,
						com.tools20022.repository.entity.DateTimePeriod.SecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.MinimumExercisableMultipleQuantitySecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.MaximumExercisableQuantitySecuritiesConversion,
						com.tools20022.repository.entity.SecuritiesQuantity.RatioDenominatorSecuritiesConversion, com.tools20022.repository.entity.SecuritiesQuantity.RatioNumeratorSecuritiesConversion,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.Option.OptionConversionInformation,
						com.tools20022.repository.entity.UnderlyingRatio.SecuritiesConversion);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesConversion.ConversionPrice, com.tools20022.repository.entity.SecuritiesConversion.ConversionDate,
						com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.MinimumExercisableMultipleQuantity,
						com.tools20022.repository.entity.SecuritiesConversion.MaximumExercisableQuantity, com.tools20022.repository.entity.SecuritiesConversion.ConversionType,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionPeriod, com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioDenominator,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionRatioNumerator, com.tools20022.repository.entity.SecuritiesConversion.Ratio,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesConversion.RelatedOption,
						com.tools20022.repository.entity.SecuritiesConversion.BusinessDayConvention, com.tools20022.repository.entity.SecuritiesConversion.ConversionChoice,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionFixedExchangeRate, com.tools20022.repository.entity.SecuritiesConversion.ConversionMarginAmount,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionOption, com.tools20022.repository.entity.SecuritiesConversion.ConversionQuotedCurrency,
						com.tools20022.repository.entity.SecuritiesConversion.FinancialCenter, com.tools20022.repository.entity.SecuritiesConversion.MinimumNoticeDays, com.tools20022.repository.entity.SecuritiesConversion.NoticePeriodType,
						com.tools20022.repository.entity.SecuritiesConversion.ProtectionAgainstDilutionIndicator, com.tools20022.repository.entity.SecuritiesConversion.ReverseConversionIndicator,
						com.tools20022.repository.entity.SecuritiesConversion.SecurityIdentification, com.tools20022.repository.entity.SecuritiesConversion.PartyType, com.tools20022.repository.entity.SecuritiesConversion.ContractSize);
			}
		});
		return mmObject_lazy.get();
	}
}