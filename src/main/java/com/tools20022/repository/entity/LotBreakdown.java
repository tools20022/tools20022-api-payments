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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Number of securities purchased or sold in one transaction. In terms of
 * options, a lot represents the number of contracts contained in one derivative
 * security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LotBreakdown" src="doc-files/LotBreakdown.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotUnit
 * LotBreakdown.mmLotUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmSecuritiesQuantity
 * LotBreakdown.mmSecuritiesQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotNumber
 * LotBreakdown.mmLotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotDateTime
 * LotBreakdown.mmLotDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
 * LotBreakdown.mmLotPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotIdentifier
 * LotBreakdown.mmLotIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmTradeLotMarket
 * LotBreakdown.mmTradeLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmQuoteLotMarket
 * LotBreakdown.mmQuoteLotMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmRoundLotMarket
 * LotBreakdown.mmRoundLotMarket}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
 * GenericIdentification.mmIdentificationForLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
 * SecuritiesPricing.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
 * TradingMarket.mmTradeLotSize}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmQuoteLot
 * TradingMarket.mmQuoteLot}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
 * TradingMarket.mmRoundLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
 * SecuritiesQuantity.mmLotBreakdown}</li>
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
 * "LotBreakdown"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security."
 * </li>
 * </ul>
 */
public class LotBreakdown {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber lotUnit;
	/**
	 * Quantity of securities included in the lot.
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities included in the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotUnit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotUnit";
			definition = "Quantity of securities included in the lot.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LotBreakdown.class.getMethod("getLotUnit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity securitiesQuantity;
	/**
	 * Number of securities included in a lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of securities included in a lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Number of securities included in a lot.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmLotBreakdown;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> lotNumber;
	/**
	 * Specifies the number of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForLot
	 * GenericIdentification.mmIdentificationForLot}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the number of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLotNumber = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotNumber";
			definition = "Specifies the number of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected ISODateTime lotDateTime;
	/**
	 * Date and time at which the lot was purchased.
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the lot was purchased."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotDateTime";
			definition = "Date and time at which the lot was purchased.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LotBreakdown.class.getMethod("getLotDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesPricing> lotPrice;
	/**
	 * Specifies the price of the lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
	 * SecuritiesPricing.mmLotBreakdown}</li>
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
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price of the lot."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLotPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotPrice";
			definition = "Specifies the price of the lot.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected Max35Text lotIdentifier;
	/**
	 * Identifies the lot constituting an asset backed or mortgage backed
	 * security issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the lot constituting an asset backed or mortgage backed security issue."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLotIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotIdentifier";
			definition = "Identifies the lot constituting an asset backed or mortgage backed security issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LotBreakdown.class.getMethod("getLotIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradingMarket tradeLotMarket;
	/**
	 * Market for which a trade lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradeLotSize
	 * TradingMarket.mmTradeLotSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLotMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a trade lot is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeLotMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeLotMarket";
			definition = "Market for which a trade lot is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmTradeLotSize;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected TradingMarket quoteLotMarket;
	/**
	 * Market for which a quote lot is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmQuoteLot
	 * TradingMarket.mmQuoteLot}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteLotMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a quote lot is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuoteLotMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuoteLotMarket";
			definition = "Market for which a quote lot is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmQuoteLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected TradingMarket roundLotMarket;
	/**
	 * Market for which a round lot size is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmRoundLot
	 * TradingMarket.mmRoundLot}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundLotMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market for which a round lot size is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRoundLotMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundLotMarket";
			definition = "Market for which a round lot size is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmRoundLot;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LotBreakdown";
				definition = "Number of securities purchased or sold in one transaction. In terms of options, a lot represents the number of contracts contained in one derivative security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmIdentificationForLot, com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown,
						com.tools20022.repository.entity.TradingMarket.mmTradeLotSize, com.tools20022.repository.entity.TradingMarket.mmQuoteLot, com.tools20022.repository.entity.TradingMarket.mmRoundLot,
						com.tools20022.repository.entity.SecuritiesQuantity.mmLotBreakdown);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LotBreakdown.mmLotUnit, com.tools20022.repository.entity.LotBreakdown.mmSecuritiesQuantity, com.tools20022.repository.entity.LotBreakdown.mmLotNumber,
						com.tools20022.repository.entity.LotBreakdown.mmLotDateTime, com.tools20022.repository.entity.LotBreakdown.mmLotPrice, com.tools20022.repository.entity.LotBreakdown.mmLotIdentifier,
						com.tools20022.repository.entity.LotBreakdown.mmTradeLotMarket, com.tools20022.repository.entity.LotBreakdown.mmQuoteLotMarket, com.tools20022.repository.entity.LotBreakdown.mmRoundLotMarket);
			}

			@Override
			public Class<?> getInstanceClass() {
				return LotBreakdown.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getLotUnit() {
		return lotUnit;
	}

	public void setLotUnit(DecimalNumber lotUnit) {
		this.lotUnit = lotUnit;
	}

	public SecuritiesQuantity getSecuritiesQuantity() {
		return securitiesQuantity;
	}

	public void setSecuritiesQuantity(com.tools20022.repository.entity.SecuritiesQuantity securitiesQuantity) {
		this.securitiesQuantity = securitiesQuantity;
	}

	public List<GenericIdentification> getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(List<com.tools20022.repository.entity.GenericIdentification> lotNumber) {
		this.lotNumber = lotNumber;
	}

	public ISODateTime getLotDateTime() {
		return lotDateTime;
	}

	public void setLotDateTime(ISODateTime lotDateTime) {
		this.lotDateTime = lotDateTime;
	}

	public List<SecuritiesPricing> getLotPrice() {
		return lotPrice;
	}

	public void setLotPrice(List<com.tools20022.repository.entity.SecuritiesPricing> lotPrice) {
		this.lotPrice = lotPrice;
	}

	public Max35Text getLotIdentifier() {
		return lotIdentifier;
	}

	public void setLotIdentifier(Max35Text lotIdentifier) {
		this.lotIdentifier = lotIdentifier;
	}

	public TradingMarket getTradeLotMarket() {
		return tradeLotMarket;
	}

	public void setTradeLotMarket(com.tools20022.repository.entity.TradingMarket tradeLotMarket) {
		this.tradeLotMarket = tradeLotMarket;
	}

	public TradingMarket getQuoteLotMarket() {
		return quoteLotMarket;
	}

	public void setQuoteLotMarket(com.tools20022.repository.entity.TradingMarket quoteLotMarket) {
		this.quoteLotMarket = quoteLotMarket;
	}

	public TradingMarket getRoundLotMarket() {
		return roundLotMarket;
	}

	public void setRoundLotMarket(com.tools20022.repository.entity.TradingMarket roundLotMarket) {
		this.roundLotMarket = roundLotMarket;
	}
}