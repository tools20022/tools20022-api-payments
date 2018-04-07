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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BillingPrice1;
import com.tools20022.repository.msg.ProprietaryPrice2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money for which goods, services or assets are offered, sold, or
 * bought.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Price" src="doc-files/Price.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmAmount
 * Price.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmOption
 * Price.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
 * Price.mmUnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
 * Price.mmNetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
 * Price.mmPriceAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
 * Price.mmGrossPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitOfMeasure
 * Price.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceTolerance
 * Price.mmPriceTolerance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmCurrency
 * Price.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmFactor
 * Price.mmFactor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetting
 * Price.mmNetting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
 * Price.mmSecuritiesPricing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
 * SecuritiesPricing.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
 * Product.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmNetPrice
 * Product.mmNetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
 * Product.mmGrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
 * Adjustment.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
 * Option.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmPrice
 * Tolerance.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmAverageDealPrice
 * Netting.mmAverageDealPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice2#mmPrice
 * ProprietaryPrice2.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmUnitPrice
 * BillingPrice1.mmUnitPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice2
 * ProprietaryPrice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: PRIC</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Price"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods, services or assets are offered, sold, or bought."
 * </li>
 * </ul>
 */
public class Price {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Price, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Price, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Price obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Price obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected Option option;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
	 * Option.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option for which a strike price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, Option> mmOption = new MMBusinessAssociationEnd<Price, Option>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Option.mmStrikePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Option.mmObject();
		}

		@Override
		public Option getValue(Price obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(Price obj, Option value) {
			obj.setOption(value);
		}
	};
	protected Product unitPriceProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product for which a unit price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, Optional<Product>> mmUnitPriceProduct = new MMBusinessAssociationEnd<Price, Optional<Product>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitPriceProduct";
			definition = "Product for which a unit price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Product.mmUnitPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Optional<Product> getValue(Price obj) {
			return obj.getUnitPriceProduct();
		}

		@Override
		public void setValue(Price obj, Optional<Product> value) {
			obj.setUnitPriceProduct(value.orElse(null));
		}
	};
	protected Product netPriceProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmNetPrice
	 * Product.mmNetPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product for which a net price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, Optional<Product>> mmNetPriceProduct = new MMBusinessAssociationEnd<Price, Optional<Product>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceProduct";
			definition = "Product for which a net price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Product.mmNetPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Optional<Product> getValue(Price obj) {
			return obj.getNetPriceProduct();
		}

		@Override
		public void setValue(Price obj, Optional<Product> value) {
			obj.setNetPriceProduct(value.orElse(null));
		}
	};
	protected List<Adjustment> priceAdjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
	 * Adjustment.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods and services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, List<Adjustment>> mmPriceAdjustment = new MMBusinessAssociationEnd<Price, List<Adjustment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceAdjustment";
			definition = "Variance on price for the goods and services.";
			minOccurs = 0;
			opposite_lazy = () -> Adjustment.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Adjustment.mmObject();
		}

		@Override
		public List<Adjustment> getValue(Price obj) {
			return obj.getPriceAdjustment();
		}

		@Override
		public void setValue(Price obj, List<Adjustment> value) {
			obj.setPriceAdjustment(value);
		}
	};
	protected Product grossPriceProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
	 * Product.mmGrossPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product for which a gross price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, Optional<Product>> mmGrossPriceProduct = new MMBusinessAssociationEnd<Price, Optional<Product>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPriceProduct";
			definition = "Product for which a gross price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Product.mmGrossPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Optional<Product> getValue(Price obj) {
			return obj.getGrossPriceProduct();
		}

		@Override
		public void setValue(Price obj, Optional<Product> value) {
			obj.setGrossPriceProduct(value.orElse(null));
		}
	};
	protected UnitOfMeasureCode unitOfMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unit of measurement. For example: kilo, tons."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Price, UnitOfMeasureCode> mmUnitOfMeasure = new MMBusinessAttribute<Price, UnitOfMeasureCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example: kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}

		@Override
		public UnitOfMeasureCode getValue(Price obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(Price obj, UnitOfMeasureCode value) {
			obj.setUnitOfMeasure(value);
		}
	};
	protected Tolerance priceTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tolerance#mmPrice
	 * Tolerance.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tolerance Tolerance}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed on the price of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, Tolerance> mmPriceTolerance = new MMBusinessAssociationEnd<Price, Tolerance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceTolerance";
			definition = "Variance allowed on the price of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Tolerance.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tolerance.mmObject();
		}

		@Override
		public Tolerance getValue(Price obj) {
			return obj.getPriceTolerance();
		}

		@Override
		public void setValue(Price obj, Tolerance value) {
			obj.setPriceTolerance(value);
		}
	};
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmCurrency
	 * BillingPrice1.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code in which the price is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Price, CurrencyCode> mmCurrency = new MMBusinessAttribute<Price, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingPrice1.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency code in which the price is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Price obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(Price obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	protected Max15NumericText factor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplication factor of measurement values. For example: 36 pieces."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Price, Max15NumericText> mmFactor = new MMBusinessAttribute<Price, Max15NumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: 36 pieces.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(Price obj) {
			return obj.getFactor();
		}

		@Override
		public void setValue(Price obj, Max15NumericText value) {
			obj.setFactor(value);
		}
	};
	protected Netting netting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#mmAverageDealPrice
	 * Netting.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Netting for which an average price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, Optional<Netting>> mmNetting = new MMBusinessAssociationEnd<Price, Optional<Netting>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting for which an average price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Netting.mmAverageDealPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Netting.mmObject();
		}

		@Override
		public Optional<Netting> getValue(Price obj) {
			return obj.getNetting();
		}

		@Override
		public void setValue(Price obj, Optional<Netting> value) {
			obj.setNetting(value.orElse(null));
		}
	};
	protected SecuritiesPricing securitiesPricing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing parameters for a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Price, SecuritiesPricing> mmSecuritiesPricing = new MMBusinessAssociationEnd<Price, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing parameters for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Price obj) {
			return obj.getSecuritiesPricing();
		}

		@Override
		public void setValue(Price obj, SecuritiesPricing value) {
			obj.setSecuritiesPricing(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "PRIC"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Price";
				definition = "Amount of money for which goods, services or assets are offered, sold, or bought.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesPricing.mmPrice, Product.mmUnitPrice, Product.mmNetPrice, Product.mmGrossPrice, Adjustment.mmPrice, Option.mmStrikePrice, Tolerance.mmPrice, Netting.mmAverageDealPrice);
				derivationElement_lazy = () -> Arrays.asList(ProprietaryPrice2.mmPrice, BillingPrice1.mmUnitPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.mmAmount, com.tools20022.repository.entity.Price.mmOption, com.tools20022.repository.entity.Price.mmUnitPriceProduct,
						com.tools20022.repository.entity.Price.mmNetPriceProduct, com.tools20022.repository.entity.Price.mmPriceAdjustment, com.tools20022.repository.entity.Price.mmGrossPriceProduct,
						com.tools20022.repository.entity.Price.mmUnitOfMeasure, com.tools20022.repository.entity.Price.mmPriceTolerance, com.tools20022.repository.entity.Price.mmCurrency, com.tools20022.repository.entity.Price.mmFactor,
						com.tools20022.repository.entity.Price.mmNetting, com.tools20022.repository.entity.Price.mmSecuritiesPricing);
				derivationComponent_lazy = () -> Arrays.asList(ProprietaryPrice2.mmObject(), BillingPrice1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Price.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Price setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Option getOption() {
		return option;
	}

	public Price setOption(Option option) {
		this.option = Objects.requireNonNull(option);
		return this;
	}

	public Optional<Product> getUnitPriceProduct() {
		return unitPriceProduct == null ? Optional.empty() : Optional.of(unitPriceProduct);
	}

	public Price setUnitPriceProduct(Product unitPriceProduct) {
		this.unitPriceProduct = unitPriceProduct;
		return this;
	}

	public Optional<Product> getNetPriceProduct() {
		return netPriceProduct == null ? Optional.empty() : Optional.of(netPriceProduct);
	}

	public Price setNetPriceProduct(Product netPriceProduct) {
		this.netPriceProduct = netPriceProduct;
		return this;
	}

	public List<Adjustment> getPriceAdjustment() {
		return priceAdjustment == null ? priceAdjustment = new ArrayList<>() : priceAdjustment;
	}

	public Price setPriceAdjustment(List<Adjustment> priceAdjustment) {
		this.priceAdjustment = Objects.requireNonNull(priceAdjustment);
		return this;
	}

	public Optional<Product> getGrossPriceProduct() {
		return grossPriceProduct == null ? Optional.empty() : Optional.of(grossPriceProduct);
	}

	public Price setGrossPriceProduct(Product grossPriceProduct) {
		this.grossPriceProduct = grossPriceProduct;
		return this;
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public Price setUnitOfMeasure(UnitOfMeasureCode unitOfMeasure) {
		this.unitOfMeasure = Objects.requireNonNull(unitOfMeasure);
		return this;
	}

	public Tolerance getPriceTolerance() {
		return priceTolerance;
	}

	public Price setPriceTolerance(Tolerance priceTolerance) {
		this.priceTolerance = Objects.requireNonNull(priceTolerance);
		return this;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public Price setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Max15NumericText getFactor() {
		return factor;
	}

	public Price setFactor(Max15NumericText factor) {
		this.factor = Objects.requireNonNull(factor);
		return this;
	}

	public Optional<Netting> getNetting() {
		return netting == null ? Optional.empty() : Optional.of(netting);
	}

	public Price setNetting(Netting netting) {
		this.netting = netting;
		return this;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public Price setSecuritiesPricing(SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = Objects.requireNonNull(securitiesPricing);
		return this;
	}
}