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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.GoodTillBookingInstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * States whether executions are booked out or accumulated on a partially filled
 * good till order on the day of execution or to accumulate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode#BookOnExecutionDay
 * GoodTillBookingInstructionCode.BookOnExecutionDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode#AccumulateTillEnd
 * GoodTillBookingInstructionCode.AccumulateTillEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode#AccumulateTillTold
 * GoodTillBookingInstructionCode.AccumulateTillTold}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: 427</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GoodTillBookingInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GoodTillBookingInstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Book out all trades on day of execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookOnExecutionDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Book out all trades on day of execution."</li>
	 * </ul>
	 */
	public static final GoodTillBookingInstructionCode BookOnExecutionDay = new GoodTillBookingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookOnExecutionDay";
			definition = "Book out all trades on day of execution.";
			owner_lazy = () -> com.tools20022.repository.codeset.GoodTillBookingInstructionCode.mmObject();
			codeName = "BOEX";
		}
	};
	/**
	 * Accumulate executions until order is filled or expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulateTillEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accumulate executions until order is filled or expires."</li>
	 * </ul>
	 */
	public static final GoodTillBookingInstructionCode AccumulateTillEnd = new GoodTillBookingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillEnd";
			definition = "Accumulate executions until order is filled or expires.";
			owner_lazy = () -> com.tools20022.repository.codeset.GoodTillBookingInstructionCode.mmObject();
			codeName = "ACTE";
		}
	};
	/**
	 * Accumulate until verbally notified otherwise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GoodTillBookingInstructionCode
	 * GoodTillBookingInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulateTillTold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accumulate until verbally notified otherwise."</li>
	 * </ul>
	 */
	public static final GoodTillBookingInstructionCode AccumulateTillTold = new GoodTillBookingInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulateTillTold";
			definition = "Accumulate until verbally notified otherwise.";
			owner_lazy = () -> com.tools20022.repository.codeset.GoodTillBookingInstructionCode.mmObject();
			codeName = "ACTT";
		}
	};
	final static private LinkedHashMap<String, GoodTillBookingInstructionCode> codesByName = new LinkedHashMap<>();

	protected GoodTillBookingInstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "427"));
				example = Arrays.asList("BOEX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GoodTillBookingInstructionCode";
				definition = "States whether executions are booked out or accumulated on a partially filled good till order on the day of execution or to accumulate.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GoodTillBookingInstructionCode.BookOnExecutionDay, com.tools20022.repository.codeset.GoodTillBookingInstructionCode.AccumulateTillEnd,
						com.tools20022.repository.codeset.GoodTillBookingInstructionCode.AccumulateTillTold);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BookOnExecutionDay.getCodeName().get(), BookOnExecutionDay);
		codesByName.put(AccumulateTillEnd.getCodeName().get(), AccumulateTillEnd);
		codesByName.put(AccumulateTillTold.getCodeName().get(), AccumulateTillTold);
	}

	public static GoodTillBookingInstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GoodTillBookingInstructionCode[] values() {
		GoodTillBookingInstructionCode[] values = new GoodTillBookingInstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GoodTillBookingInstructionCode> {
		@Override
		public GoodTillBookingInstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GoodTillBookingInstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}