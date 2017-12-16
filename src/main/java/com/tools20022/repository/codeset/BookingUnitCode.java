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
import com.tools20022.repository.codeset.BookingUnitCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Description of the method used to book single or grouped executions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode#EachPartial
 * BookingUnitCode.mmEachPartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode#AggregatePartial
 * BookingUnitCode.mmAggregatePartial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode#AggregateExecutions
 * BookingUnitCode.mmAggregateExecutions}</li>
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
 * <li>"EACP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BookingUnitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Description of the method used to book single or grouped executions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BookingUnitCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Each partial execution is a bookable unit
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode
	 * BookingUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EACP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EachPartial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Each partial execution is a bookable unit"</li>
	 * </ul>
	 */
	public static final BookingUnitCode EachPartial = new BookingUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EachPartial";
			definition = "Each partial execution is a bookable unit";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingUnitCode.mmObject();
			codeName = "EACP";
		}
	};
	/**
	 * Aggregate partial executions on this order, and book one trade per order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode
	 * BookingUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatePartial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Aggregate partial executions on this order, and book one trade per order."
	 * </li>
	 * </ul>
	 */
	public static final BookingUnitCode AggregatePartial = new BookingUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatePartial";
			definition = "Aggregate partial executions on this order, and book one trade per order.";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingUnitCode.mmObject();
			codeName = "AGGP";
		}
	};
	/**
	 * Aggregate executions for this symbol, side and settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookingUnitCode
	 * BookingUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateExecutions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Aggregate executions for this symbol, side and settlement date."</li>
	 * </ul>
	 */
	public static final BookingUnitCode AggregateExecutions = new BookingUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateExecutions";
			definition = "Aggregate executions for this symbol, side and settlement date.";
			owner_lazy = () -> com.tools20022.repository.codeset.BookingUnitCode.mmObject();
			codeName = "AGGE";
		}
	};
	final static private LinkedHashMap<String, BookingUnitCode> codesByName = new LinkedHashMap<>();

	protected BookingUnitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("EACP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BookingUnitCode";
				definition = "Description of the method used to book single or grouped executions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookingUnitCode.EachPartial, com.tools20022.repository.codeset.BookingUnitCode.AggregatePartial,
						com.tools20022.repository.codeset.BookingUnitCode.AggregateExecutions);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EachPartial.getCodeName().get(), EachPartial);
		codesByName.put(AggregatePartial.getCodeName().get(), AggregatePartial);
		codesByName.put(AggregateExecutions.getCodeName().get(), AggregateExecutions);
	}

	public static BookingUnitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BookingUnitCode[] values() {
		BookingUnitCode[] values = new BookingUnitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BookingUnitCode> {
		@Override
		public BookingUnitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BookingUnitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}