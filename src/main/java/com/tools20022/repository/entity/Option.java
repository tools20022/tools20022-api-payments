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
import com.tools20022.repository.entity.Derivative;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contracts which grant to the holder either the privilege to purchase or the
 * privilege to sell the assets specified at a predetermined price or formula at
 * or within a time in the future.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Option" src="doc-files/Option.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#InstrumentAssignmentMethod
 * Option.InstrumentAssignmentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettleStyle
 * Option.SettleStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#Standardisation
 * Option.Standardisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#PositionLimit
 * Option.PositionLimit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#UnderlyingType
 * Option.UnderlyingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#CoverIndicator
 * Option.CoverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#OptionConversionInformation
 * Option.OptionConversionInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionRatio
 * Option.OptionRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Option#SecuritiesOptionTrade
 * Option.SecuritiesOptionTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettlementType
 * Option.SettlementType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikeMultiplier
 * Option.StrikeMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#ExpiryLocation
 * Option.ExpiryLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#FinalSettlementDate
 * Option.FinalSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionStyle
 * Option.OptionStyle}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#CurrencyOption
 * Option.CurrencyOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#EarliestExerciseDate
 * Option.EarliestExerciseDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettlementDays
 * Option.SettlementDays}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikePrice
 * Option.StrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionStartDate
 * Option.OptionStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#ExpiryDateAndTime
 * Option.ExpiryDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#OptionType
 * Option.OptionType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikeValue
 * Option.StrikeValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#SettlementPeriodType
 * Option.SettlementPeriodType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#Option Price.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#RelatedOption
 * SecuritiesConversion.RelatedOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#OptionDefinition
 * CurrencyOption.OptionDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#Option
 * SecuritiesOptionTrade.Option}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
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
 * "Option"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future."
 * </li>
 * </ul>
 */
public class Option extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method under which assignment was conducted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssignmentMethodCode
	 * AssignmentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentAssignmentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method under which assignment was conducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InstrumentAssignmentMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstrumentAssignmentMethod";
			definition = "Method under which assignment was conducted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AssignmentMethodCode.mmObject();
		}
	};
	/**
	 * Specifies whether the option contract settles at the open or close of the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettleStyleCode
	 * SettleStyleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettleStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the option contract settles at the open or close of the market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettleStyle = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettleStyle";
			definition = "Specifies whether the option contract settles at the open or close of the market.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettleStyleCode.mmObject();
		}
	};
	/**
	 * Specifies whether the terms of the security (underlying instruments,
	 * expiration date, contract size) are defined according to the exchange
	 * specifications or whether they can be user defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Standardisation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}
	};
	/**
	 * Indicates the maximum number of listed option contracts on a single
	 * security which can be held by an investor or group of investors acting
	 * jointly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PositionLimit = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PositionLimit";
			definition = "Indicates the maximum number of listed option contracts on a single security which can be held by an investor or group of investors acting jointly.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies the type of underlying to which the option relates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying to which the option relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnderlyingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the underlying financial instrument of an option is
	 * owned by the writer of the option.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the underlying financial instrument of an option is owned by the writer of the option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CoverIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CoverIndicator";
			definition = "Indicates whether the underlying financial instrument of an option is owned by the writer of the option.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information on the conversion exchange of an option into another form of
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#RelatedOption
	 * SecuritiesConversion.RelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionConversionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the conversion exchange of an option into another form of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OptionConversionInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionConversionInformation";
			definition = "Information on the conversion exchange of an option into another form of securities.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.RelatedOption;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Expresses the risk of an option leg. Value must be between -1 and 1. A
	 * Call Option will require a ratio value between 0 and 1. A Put Option will
	 * require a ratio value between -1 and 0.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionRatio = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionRatio";
			definition = "Expresses the risk of an option leg. Value must be between -1 and 1. A Call Option will require a ratio value between 0 and 1. A Put Option will require a ratio value between -1 and 0.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Specifies the trade elements for the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade#Option
	 * SecuritiesOptionTrade.Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOptionTrade
	 * SecuritiesOptionTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOptionTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trade elements for the option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesOptionTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOptionTrade";
			definition = "Specifies the trade elements for the option.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOptionTrade.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the trade is to be settled as principal or netted off
	 * against another trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTypeCode
	 * SettlementTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the trade is to be settled as principal or netted off against another trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Indicates whether the trade is to be settled as principal or netted off against another trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementTypeCode.mmObject();
		}
	};
	/**
	 * Multiplier applied to the strike price for the purpose of calculating the
	 * settlement value (Used for derivatives).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeMultiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrikeMultiplier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeMultiplier";
			definition = "Multiplier applied to the strike price for the purpose of calculating the settlement value (Used for derivatives).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Financial center where option expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial center where option expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryLocation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryLocation";
			definition = "Financial center where option expires.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Date on which the trade is settled. i.e., the amounts are due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled. i.e., the amounts are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinalSettlementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled. i.e., the amounts are due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies how an option can be exercised (American, European, Bermudan)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionStyleCode
	 * OptionStyleCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStyle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how an option can be exercised (American, European, Bermudan)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionStyle = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStyle";
			definition = "Specifies how an option can be exercised (American, European, Bermudan)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionStyleCode.mmObject();
		}
	};
	/**
	 * Information specific to a currency option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#OptionDefinition
	 * CurrencyOption.OptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to a currency option."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyOption";
			definition = "Information specific to a currency option.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.OptionDefinition;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * First date on which an american option can be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an american option can be exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarliestExerciseDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestExerciseDate";
			definition = "First date on which an american option can be exercised.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Number of business days between the hit date and the payment date in case
	 * of settlement at hit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of business days between the hit date and the payment date in case of settlement at hit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDays = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDays";
			definition = "Number of business days between the hit date and the payment date in case of settlement at hit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Predetermined price at which the holder will have to buy or sell the
	 * underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Price#Option
	 * Price.Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StrikePrice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikePrice";
			definition = "Predetermined price at which the holder will have to buy or sell the underlying instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Price.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Price.Option;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * First date on which an option becomes effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First date on which an option becomes effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionStartDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionStartDate";
			definition = "First date on which an option becomes effective.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * For European options, date on which the option holder can only exercise
	 * the right or let it lapse. For American options, the option holder can
	 * exercise the right up to the expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDateAndTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDateAndTime";
			definition = "For European options, date on which the option holder can only exercise the right or let it lapse. For American options, the option holder can exercise the right up to the expiry date.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies whether it is a Call option (right to purchase a specific
	 * underlying asset) or a Put option (right to sell a specific underlying
	 * asset).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionDefinitionTypeCode
	 * OptionDefinitionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OptionType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OptionType";
			definition = "Specifies whether it is a Call option (right to purchase a specific underlying asset) or a Put option (right to sell a specific underlying asset).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OptionDefinitionTypeCode.mmObject();
		}
	};
	/**
	 * Number of shares/units for the financial instrument involved in the
	 * option trade (Used for derivatives).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StrikeValue = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StrikeValue";
			definition = "Number of shares/units for the financial instrument involved in the option trade (Used for derivatives).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Specifies how settlement will take place for instance at expiration or at
	 * hit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Option
	 * Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPeriodType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how settlement will take place for instance at expiration or at hit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementPeriodType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Option.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementPeriodType";
			definition = "Specifies how settlement will take place for instance at expiration or at hit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Option";
				definition = "Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.Option, com.tools20022.repository.entity.SecuritiesConversion.RelatedOption,
						com.tools20022.repository.entity.CurrencyOption.OptionDefinition, com.tools20022.repository.entity.SecuritiesOptionTrade.Option);
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Option.InstrumentAssignmentMethod, com.tools20022.repository.entity.Option.SettleStyle, com.tools20022.repository.entity.Option.Standardisation,
						com.tools20022.repository.entity.Option.PositionLimit, com.tools20022.repository.entity.Option.UnderlyingType, com.tools20022.repository.entity.Option.CoverIndicator,
						com.tools20022.repository.entity.Option.OptionConversionInformation, com.tools20022.repository.entity.Option.OptionRatio, com.tools20022.repository.entity.Option.SecuritiesOptionTrade,
						com.tools20022.repository.entity.Option.SettlementType, com.tools20022.repository.entity.Option.StrikeMultiplier, com.tools20022.repository.entity.Option.ExpiryLocation,
						com.tools20022.repository.entity.Option.FinalSettlementDate, com.tools20022.repository.entity.Option.OptionStyle, com.tools20022.repository.entity.Option.CurrencyOption,
						com.tools20022.repository.entity.Option.EarliestExerciseDate, com.tools20022.repository.entity.Option.SettlementDays, com.tools20022.repository.entity.Option.StrikePrice,
						com.tools20022.repository.entity.Option.OptionStartDate, com.tools20022.repository.entity.Option.ExpiryDateAndTime, com.tools20022.repository.entity.Option.OptionType,
						com.tools20022.repository.entity.Option.StrikeValue, com.tools20022.repository.entity.Option.SettlementPeriodType);
			}
		});
		return mmObject_lazy.get();
	}
}