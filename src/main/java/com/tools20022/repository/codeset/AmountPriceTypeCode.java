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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AmountPriceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the amount price type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode#ActualAmount
 * AmountPriceTypeCode.ActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode#Discount
 * AmountPriceTypeCode.Discount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode#Lot
 * AmountPriceTypeCode.Lot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode#Premium
 * AmountPriceTypeCode.Premium}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountPriceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the amount price type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AmountPriceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a currency and amount per unit or per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a currency and amount per unit or per share."</li>
	 * </ul>
	 */
	public static final AmountPriceTypeCode ActualAmount = new AmountPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualAmount";
			definition = "Price expressed as a currency and amount per unit or per share.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceTypeCode.mmObject();
			codeName = "ACTU";
		}
	};
	/**
	 * Price expressed as a discount amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a discount amount."</li>
	 * </ul>
	 */
	public static final AmountPriceTypeCode Discount = new AmountPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Price expressed as a discount amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceTypeCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Price expressed as an amount of money per lot.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as an amount of money per lot."</li>
	 * </ul>
	 */
	public static final AmountPriceTypeCode Lot = new AmountPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lot";
			definition = "Price expressed as an amount of money per lot.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceTypeCode.mmObject();
			codeName = "PLOT";
		}
	};
	/**
	 * Price expressed as a premium.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a premium."</li>
	 * </ul>
	 */
	public static final AmountPriceTypeCode Premium = new AmountPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "Price expressed as a premium.";
			owner_lazy = () -> com.tools20022.repository.codeset.AmountPriceTypeCode.mmObject();
			codeName = "PREM";
		}
	};
	final static private LinkedHashMap<String, AmountPriceTypeCode> codesByName = new LinkedHashMap<>();

	protected AmountPriceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountPriceTypeCode";
				definition = "Specifies the amount price type.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AmountPriceTypeCode.ActualAmount, com.tools20022.repository.codeset.AmountPriceTypeCode.Discount, com.tools20022.repository.codeset.AmountPriceTypeCode.Lot,
						com.tools20022.repository.codeset.AmountPriceTypeCode.Premium);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActualAmount.getCodeName().get(), ActualAmount);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Lot.getCodeName().get(), Lot);
		codesByName.put(Premium.getCodeName().get(), Premium);
	}

	public static AmountPriceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AmountPriceTypeCode[] values() {
		AmountPriceTypeCode[] values = new AmountPriceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AmountPriceTypeCode> {
		@Override
		public AmountPriceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AmountPriceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}