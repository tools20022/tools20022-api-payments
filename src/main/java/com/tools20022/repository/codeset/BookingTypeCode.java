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
import com.tools20022.repository.codeset.BookingTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Method for booking out an order. Used when notifying a broker that an order
 * to be settled by that broker is to be booked out as an OTC derivative (e.g.
 * CFD or similar).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BookingTypeCode#Regular
 * BookingTypeCode.mmRegular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingTypeCode#ContractForDifference
 * BookingTypeCode.mmContractForDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingTypeCode#TotalReturnSwap
 * BookingTypeCode.mmTotalReturnSwap}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REGU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BookingTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Method for booking out an order. Used when notifying a broker that an order to be settled by that broker is to be booked out as an OTC derivative (e.g. CFD or similar)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BookingTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Booking type is regular.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingTypeCode
	 * BookingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Booking type is regular."</li>
	 * </ul>
	 */
	public static final BookingTypeCode Regular = new BookingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			definition = "Booking type is regular.";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingTypeCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Order is to be booked out as a CFD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingTypeCode
	 * BookingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractForDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is to be booked out as a CFD."</li>
	 * </ul>
	 */
	public static final BookingTypeCode ContractForDifference = new BookingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractForDifference";
			definition = "Order is to be booked out as a CFD.";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingTypeCode.mmObject();
			codeName = "CFOD";
		}
	};
	/**
	 * Order is to be booked out as an OTC derivative (for example, Swap).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingTypeCode
	 * BookingTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReturnSwap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Order is to be booked out as an OTC derivative (for example, Swap)."</li>
	 * </ul>
	 */
	public static final BookingTypeCode TotalReturnSwap = new BookingTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReturnSwap";
			definition = "Order is to be booked out as an OTC derivative (for example, Swap).";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingTypeCode.mmObject();
			codeName = "TRSW";
		}
	};
	final static private LinkedHashMap<String, BookingTypeCode> codesByName = new LinkedHashMap<>();

	protected BookingTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REGU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BookingTypeCode";
				definition = "Method for booking out an order. Used when notifying a broker that an order to be settled by that broker is to be booked out as an OTC derivative (e.g. CFD or similar).";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookingTypeCode.Regular, com.tools20022.repository.codeset.BookingTypeCode.ContractForDifference,
						com.tools20022.repository.codeset.BookingTypeCode.TotalReturnSwap);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(ContractForDifference.getCodeName().get(), ContractForDifference);
		codesByName.put(TotalReturnSwap.getCodeName().get(), TotalReturnSwap);
	}

	public static BookingTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BookingTypeCode[] values() {
		BookingTypeCode[] values = new BookingTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BookingTypeCode> {
		@Override
		public BookingTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BookingTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}