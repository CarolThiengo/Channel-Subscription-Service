package ada.tech.tenthirty.tvpackages.infra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class NotifyInvoiceQueue {
    @Value("${config.notify-invoice.queue.out}")
    private String queueSubs;

    @Bean
    public Queue queue(){
        return new Queue(queueSubs, true);
    }
}
